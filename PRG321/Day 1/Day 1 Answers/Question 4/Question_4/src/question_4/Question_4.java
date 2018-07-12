/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_4;

/**
 *
 * @author Michael
 */
import java.io.*;
import java.util.Scanner;
public class Question_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner in = new Scanner(System.in);
    int numInput = in.nextInt();
    in.close();


    if (numInput % 2 != 0) {
      System.out.printf("no");
    } else {

      for (int i = 0; i <= numInput; i++) {

        if (Math.pow(2, i) == numInput){
        System.out.println("yes");
        }
       }
      }
   
    
    }
}
