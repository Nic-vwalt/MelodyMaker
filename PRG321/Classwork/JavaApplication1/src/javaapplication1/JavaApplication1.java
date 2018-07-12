/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author user
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int year;
        String name;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Car year");
        year = SC.nextInt();
        System.out.println("Enter Car name");
        name = SC.next();
        
        int myyear = 2015;
        String model = "C Class";
        Merc a = new Merc(myyear,model);
        System.out.println(a.toString());
        
        Merc[] mercarr = new Merc[5];
        mercarr[0] = a;
        System.out.println(mercarr[0]);
        
        ArrayList<Merc> arrl = new ArrayList<>();
        
        arrl.add(a);
        
        
    }
    
}
