/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_practice_file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class food_get extends UnicastRemoteObject implements food_ingredients{

    public food_get() throws RemoteException{
    
    }

    @Override
    public String[] displayFood() throws RemoteException {
       
        String [] sar  = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("food.txt"));
            String read = "";
            while ((read = br.readLine()) != null) {                
                sar = read.split("#");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(food_get.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(food_get.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    return sar;
    
}
}
