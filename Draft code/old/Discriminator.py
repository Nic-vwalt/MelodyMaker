# -*- coding: utf-8 -*-
"""
Created on Jul 19 10:58:30 2018

@author: Nicolas
"""
with tf.variable_scope('D') as scope:
      scope.set_regularizer(tf.contrib.layers.l2_regularizer(scale=FLAGS.reg_scale))


      print('self._input_songdata shape {}'.format(self._input_songdata.get_shape()))
      print('generated data shape {}'.format(self._generated_features[0].get_shape()))
      # TODO: (possibly temporarily) disabling meta info
      if FLAGS.generate_meta:
        songdata_inputs = [tf.concat([self._input_metadata, songdata_input],1) for songdata_input in songdata_inputs]
      #print(songdata_inputs[0])
      #print(songdata_inputs[0])
      #print('metadata inputs shape {}'.format(self._input_metadata.get_shape()))
      #print('generated metadata shape {}'.format(meta_probs.get_shape()))
      self.real_d,self.real_d_features = self.discriminator(songdata_inputs, is_training, msg='real')
      scope.reuse_variables()
      # TODO: (possibly temporarily) disabling meta info
      if FLAGS.generate_meta:
        generated_data = [tf.concat([meta_probs, songdata_input],1) for songdata_input in self._generated_features]
      else:
        generated_data = self._generated_features
      if songdata_inputs[0].get_shape() != generated_data[0].get_shape():
        print('songdata_inputs shape {} != generated data shape {}'.format(songdata_inputs[0].get_shape(), generated_data[0].get_shape()))
      self.generated_d,self.generated_d_features = self.discriminator(generated_data, is_training, msg='generated')

    # Define the loss for discriminator and generator networks (see the original
    # paper for details), and create optimizers for both
    self.d_loss = tf.reduce_mean(-tf.log(tf.clip_by_value(self.real_d, 1e-1000000, 1.0)) \
                                 -tf.log(1 - tf.clip_by_value(self.generated_d, 0.0, 1.0-1e-1000000)))
    self.g_loss_feature_matching = tf.reduce_sum(tf.squared_difference(self.real_d_features, self.generated_d_features))
    self.g_loss = tf.reduce_mean(-tf.log(tf.clip_by_value(self.generated_d, 1e-1000000, 1.0)))

    if not FLAGS.disable_l2_regularizer:
      self.d_loss = self.d_loss+reg_loss
      self.g_loss_feature_matching = self.g_loss_feature_matching+reg_loss
      self.g_loss = self.g_loss+reg_loss
    self.d_params = [v for v in tf.trainable_variables() if v.name.startswith('model/D/')]

    if not is_training:
      return

    d_optimizer = tf.train.GradientDescentOptimizer(self._lr*FLAGS.d_lr_factor)
    d_grads, _ = tf.clip_by_global_norm(tf.gradients(self.d_loss, self.d_params),
                                        FLAGS.max_grad_norm)
    self.opt_d = d_optimizer.apply_gradients(zip(d_grads, self.d_params))
    if FLAGS.feature_matching:
      g_grads, _ = tf.clip_by_global_norm(tf.gradients(self.g_loss_feature_matching,
                                                       self.g_params),
                                        FLAGS.max_grad_norm)
    else:
      g_grads, _ = tf.clip_by_global_norm(tf.gradients(self.g_loss, self.g_params),
                                        FLAGS.max_grad_norm)
    self.opt_g = g_optimizer.apply_gradients(zip(g_grads, self.g_params))

    self._new_lr = tf.placeholder(shape=[], name="new_learning_rate", dtype=data_type())
    self._lr_update = tf.assign(self._lr, self._new_lr)

  def discriminator(self, inputs, is_training, msg=''):
    # RNN discriminator:
    #for i in xrange(len(inputs)):
    #  print('shape inputs[{}] {}'.format(i, inputs[i].get_shape()))
    #inputs[0] = tf.Print(inputs[0], [inputs[0]],
    #        '{} inputs[0] = '.format(msg), summarize=20, first_n=20)
    if is_training and FLAGS.keep_prob < 1:
      inputs = [tf.nn.dropout(input_, FLAGS.keep_prob) for input_ in inputs]
    
    #lstm_cell = tf.nn.rnn_cell.BasicLSTMCell(FLAGS.hidden_size_d, forget_bias=1.0, state_is_tuple=True)
    if is_training and FLAGS.keep_prob < 1:
      #lstm_cell = tf.nn.rnn_cell.DropoutWrapper(
      #lstm_cell, output_keep_prob=FLAGS.keep_prob)
      cell_fw = make_rnn_cell([FLAGS.hidden_size_d]* FLAGS.num_layers_d,dropout_keep_prob=FLAGS.keep_prob)
      
      cell_bw = make_rnn_cell([FLAGS.hidden_size_d]* FLAGS.num_layers_d,dropout_keep_prob=FLAGS.keep_prob)
    else:
      cell_fw = make_rnn_cell([FLAGS.hidden_size_d]* FLAGS.num_layers_d)
      
      cell_bw = make_rnn_cell([FLAGS.hidden_size_d]* FLAGS.num_layers_d)
    #cell_fw = tf.nn.rnn_cell.MultiRNNCell([lstm_cell for _ in range( FLAGS.num_layers_d)], state_is_tuple=True)
    self._initial_state_fw = cell_fw.zero_state(self.batch_size, data_type())
    if not FLAGS.unidirectional_d:
      #lstm_cell = tf.nn.rnn_cell.BasicLSTMCell(FLAGS.hidden_size_g, forget_bias=1.0, state_is_tuple=True)
      #if is_training and FLAGS.keep_prob < 1:
      #  lstm_cell = tf.nn.rnn_cell.DropoutWrapper(
      #      lstm_cell, output_keep_prob=FLAGS.keep_prob)
      #cell_bw = tf.nn.rnn_cell.MultiRNNCell([lstm_cell for _ in range( FLAGS.num_layers_d)], state_is_tuple=True)
      self._initial_state_bw = cell_bw.zero_state(self.batch_size, data_type())
      print("cell_fw",cell_fw.output_size)
      #print("cell_bw",cell_bw.output_size)
      #print("inputs",inputs)
      #print("initial_state_fw",self._initial_state_fw)
      #print("initial_state_bw",self._initial_state_bw)
      outputs, state_fw, state_bw = tf.contrib.rnn.static_bidirectional_rnn(cell_fw, cell_bw, inputs, initial_state_fw=self._initial_state_fw, initial_state_bw=self._initial_state_bw)
      #outputs[0] = tf.Print(outputs[0], [outputs[0]],
      #        '{} outputs[0] = '.format(msg), summarize=20, first_n=20)
      #state = tf.concat(state_fw, state_bw)
      #endoutput = tf.concat(concat_dim=1, values=[outputs[0],outputs[-1]])
    else:
      outputs, state = tf.nn.rnn(cell_fw, inputs, initial_state=self._initial_state_fw)
      #state = self._initial_state
	  
      #outputs, state = cell_fw(tf.convert_to_tensor (inputs),state)
      #endoutput = outputs[-1]

    if FLAGS.minibatch_d:
      outputs = [minibatch(tf.reshape(outp, shape=[FLAGS.batch_size, -1]), msg=msg, reuse_scope=(i!=0)) for i,outp in enumerate(outputs)]
    # decision = tf.sigmoid(linear(outputs[-1], 1, 'decision'))
    if FLAGS.end_classification:
      decisions = [tf.sigmoid(linear(output, 1, 'decision', reuse_scope=(i!=0))) for i,output in enumerate([outputs[0], outputs[-1]])]
      decisions = tf.stack(decisions)
      decisions = tf.transpose(decisions, perm=[1,0,2])
      print('shape, decisions: {}'.format(decisions.get_shape()))
    else:
      decisions = [tf.sigmoid(linear(output, 1, 'decision', reuse_scope=(i!=0))) for i,output in enumerate(outputs)]
      decisions = tf.stack(decisions)
      decisions = tf.transpose(decisions, perm=[1,0,2])
      print('shape, decisions: {}'.format(decisions.get_shape()))
    decision = tf.reduce_mean(decisions, reduction_indices=[1,2])
    decision = tf.Print(decision, [decision],
            '{} decision = '.format(msg), summarize=20, first_n=20)
    return (decision,tf.transpose(tf.stack(outputs), perm=[1,0,2]))
