/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import package_2.*;

/**
 *
 * @author user
 */
public class Day2_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);        //Method 1 of reading input
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//       System.out.println("Enter your phone number");
//        int phone = sc.nextInt();
//        
//        
//        
//        InputStreamReader ir = new InputStreamReader(System.in); //Method 2 of reading input
//        BufferedReader br = new BufferedReader(ir);
//        System.out.println("Enter a campus name:");     //Printing a value
//        String campus = br.readLine();
//        System.out.println("Enter your year:");
//        int year = Integer.parseInt(br.readLine()); //Convert String to INT
//        String convert = String.valueOf(year); // Method 1 of Convert INT to string
//        String convert2 = Integer.toString(year); // Method 2 of Convert INT to string
//        
//        
//        System.out.println("Your name is: "+name);
//        System.out.println("Your number is: "+phone);
//        System.out.println("Your campus is: "+campus);
//        System.out.println("Your year is: "+year);
        

            //Calling other classes//
//=====================================================//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter car model");
//        int model = sc.nextInt();
//        System.out.println("Enter year");
//        int year = sc.nextInt();
//        System.out.println("Enter name");
//        String name = sc.next();
//        
//        Car c1 = new Car(year, name, model);
//        System.out.println(c1.toString());
        
 //====================================================//
 
 
 //Calling other Interfaces//
//=====================================================//
Interface_Class ic = new Interface_Class();
ic.make_process();

Interface_Class2 ic2 = new Interface_Class2();
ic2.make_process();

ic.Display();
        System.out.println(ic.cost());

 //====================================================//
    }
    
    
}
