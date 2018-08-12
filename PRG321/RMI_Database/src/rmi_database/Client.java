/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_database;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    private final static int DisplayFood = 1;
    private final static int DisplayIng = 2;
    
    
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException, ClassNotFoundException, SQLException {
        // TODO code application logic here
        getfood gf = new getfood();
        Datahandler dh = new Datahandler();
        Scanner sc = new Scanner(System.in);
         Registry reg = LocateRegistry.getRegistry("localhost",1099);
        food_interface iadd = (food_interface)Naming.lookup("Hello");
        System.out.println("=============================");
        System.out.println("------------Menu-------------");
        System.out.println("=============================");
        System.out.println("1. Display all food");
        System.out.println("2. Display specific food ingredient");
        int opt = sc.nextInt();
        switch(opt)
        {
            case DisplayFood:
                dh.display_food();
                break;
            case DisplayIng:
                dh.display_ingredients(iadd.get_food_Name());
                break;
        }

    }
    
}
