/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_14;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Question_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = Integer.parseInt(in.nextLine());
        if (age > 18) {
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You may not vote");
        }
        
    }
    
}
