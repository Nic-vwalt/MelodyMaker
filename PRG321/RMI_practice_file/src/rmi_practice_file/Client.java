/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_practice_file;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author user
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        // TODO code application logic here
         Registry reg = LocateRegistry.getRegistry("localhost",1099);
        food_ingredients iadd = (food_ingredients)Naming.lookup("Hello");
        
        String [] answ = iadd.displayFood();
        
        System.out.println("Ingredients: Size:   Price:");
        System.out.println("----------------------------------");
        for (int i = 0; i < answ.length; i++) {
            System.out.printf("%5s |%5s %s",answ[0],answ[1],answ[2]);
            System.out.println("");
        }
    }
    
}
