/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Michael
 */
import java.io.*;

public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int numInput = Integer.parseInt(br.readLine());
        if (numInput % 2 != 0) {
            
            System.out.println(numInput+ " is odd");
        }
        else{
            System.out.println(numInput+ " is even");
        }
        }
        
    }
    

