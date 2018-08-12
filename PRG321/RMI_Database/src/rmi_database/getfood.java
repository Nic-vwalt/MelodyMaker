/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_database;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class getfood extends UnicastRemoteObject implements food_interface{

    public getfood() throws RemoteException{
    }

    
    
    @Override
    public String get_food_Name() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Enter food name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
    return name;
    }
    
}
