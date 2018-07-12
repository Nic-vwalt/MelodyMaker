/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_3;

import java.awt.Menu;
import java.util.Scanner;

/**
 *
 * @author Michael
 */

enum choices
{
Music,Movie;
}
public class Question_3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Movie \n2. Music");
        System.out.println("Enter a number");
        int answ = sc.nextInt();
        choices c = choices.Movie;
        
        if (answ == 0) {
           c = choices.Movie;
        }
        else
        {
        c = choices.Music;
        }
        
        switch(c)
        {
        case Movie:
            System.out.println("Watch a movie");
            break;
        case Music:
            System.out.println("Listen music");
            break;
        }
        
        
        
        
        
    }
    
    

   
    
}
