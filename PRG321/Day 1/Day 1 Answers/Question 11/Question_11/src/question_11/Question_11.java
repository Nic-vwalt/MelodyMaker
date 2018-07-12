/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_11;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Question_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = in.nextLine();
        
        if (Character.isUpperCase(word.charAt(0))) {
            System.out.println("Uppercase Letter");
        }
        else
            if (Character.isLowerCase(word.charAt(0))) {
                System.out.println("Lowercase Letter");
            }
    }
    
}
