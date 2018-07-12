/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_2_2;

/**
 *
 * @author user
 */
public class Employee extends Lecturer{
    
//    static final int empnum;//Blank final
//
//    static
//    {
//    empnum = 55555;
//    }               //static value
    
//    public Employee(int empnum) {
//    this.empnum = empnum;
//        
//    }
String name;


    public Employee(String name) {
        super("Employee");        //Immediate parent class constructor
        this.name = name;
    }

    
    public void display()
    {
       // System.out.println("Child Class Name: "+name);
        System.out.println("Calling parent from child class: "+super.name); //Display parent from child class
        super.Display();
        
    }
}
