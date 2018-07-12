/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_15;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Question_15 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Assignment Grade:");
        double assign = Integer.parseInt(in.nextLine());
        System.out.println("Mid-Term Grade:");
        double mid = Integer.parseInt(in.nextLine());
        System.out.println("Finals Grade:");
        double finals = Integer.parseInt(in.nextLine());
        double average = (assign + mid + finals /3);
        
        if (average >= 90) {
            System.out.println("Grade: A");
        }
        else
            if (average >= 70 && average<90) {
                System.out.println("Grade: B");
            }
        else
                if (average >=50 && average <70) {
                    System.out.println("Grade: C");
                }
        else
                    if (average <50) {
                        System.out.println("Grade: F");
                    }
               
    }
    
}
