/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

/**
 *
 * @author Michael
 */
import java.io.*;
public class Question_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        boolean prime = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number");
        int numInput = Integer.parseInt(br.readLine());
         for(int divisor = 2; divisor < numInput / 2; divisor++) {
            if(numInput % divisor == 0)
            {

                prime = false;
            }
            prime = true;
        }
        if(prime)
        {
            System.out.println("Prime number");

        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
    
}
