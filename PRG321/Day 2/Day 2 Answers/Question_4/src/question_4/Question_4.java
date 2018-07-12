/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Question_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double temp =0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students");
        int numstudents = sc.nextInt();
        int grades[] = new int[numstudents];
        for (int i = 0; i < numstudents; i++) {
            System.out.println("Enter grade for student "+i);
            grades[i] = sc.nextInt();
            temp= temp + grades[i];
        }
        double average = temp/numstudents;
        System.out.println(average);
    }
    
}
