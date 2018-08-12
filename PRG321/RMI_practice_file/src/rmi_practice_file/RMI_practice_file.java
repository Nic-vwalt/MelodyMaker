/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_practice_file;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author user
 */
public class RMI_practice_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        // TODO code application logic here
         Registry registry  = LocateRegistry.createRegistry(1099);
        System.out.println("Server is running,then you better go catch it");
        
        food_ingredients ob = new food_get();
        registry.bind("Hello", ob);
        System.out.println("Server started");
        
    }
    
}
