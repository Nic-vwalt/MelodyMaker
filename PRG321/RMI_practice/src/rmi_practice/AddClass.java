/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_practice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author user
 */

//Step 2
public class AddClass extends UnicastRemoteObject implements AddInterface{

    public AddClass() throws RemoteException{
    
    }

    @Override
    public int add(int x, int y) throws RemoteException {
    return  x+y;
    }
    
}
