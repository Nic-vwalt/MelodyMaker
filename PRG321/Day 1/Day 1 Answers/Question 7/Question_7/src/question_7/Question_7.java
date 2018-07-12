/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_7;

/**
 *
 * @author Michael
 */
public class Question_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String str1 = "michael";
    String answer = "";
 
    for (int i=str1.length()-1; i>=0; i--) {
      answer += str1.charAt(i);
    }
 
    System.out.println(answer);
 
  }
    }
    

