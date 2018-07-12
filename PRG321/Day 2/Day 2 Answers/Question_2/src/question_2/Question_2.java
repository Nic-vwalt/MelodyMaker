/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Question_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char sure = 'n';
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Do you want to study at Belgium Campus? y/n");
        char answ = (char) System.in.read();
        if (answ == 'y') {
            System.out.println("Correct choice");
        }
         else
        {
        System.out.println("Are you sure? Because we think you are going to miss out? Y/N");
         sure = (char) System.in.read();
            
            
            if (sure == 'n') {
                System.out.println("We thought so!");
            }
            else
            {
                System.out.println("Wrong Choice!");

        
            }
        }
        
        }
        while(sure == 'n');
}
}
    
   
    