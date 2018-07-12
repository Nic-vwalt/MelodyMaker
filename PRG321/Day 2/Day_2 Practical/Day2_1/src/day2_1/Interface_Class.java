/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_1;

/**
 *
 * @author user
 */
public class Interface_Class implements InterfaceOne,I_ShowRoom{

    @Override
    public void make_process() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("This is the first car");
    }

    @Override
    public void Display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("I am displaying car 1");
    }
    
    public int cost()
    {
        return 500000;
      
    }
    
    
}
