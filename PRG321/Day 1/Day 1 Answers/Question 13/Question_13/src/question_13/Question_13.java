/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_13;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Question_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number One");
        int numOne = in.nextInt();
        System.out.println("Enter Number Two");
        int numTwo = in.nextInt();
        add(numOne, numTwo);
        subtract(numOne, numTwo);
        devide(numOne, numTwo);
        multiply(numOne, numTwo);
    }
    public static void add(int numOne,int numTwo)
        {
        int answer = numOne + numTwo;
            System.out.println("Add: "+answer);
        }
    public static void subtract(int numOne,int numTwo)
        {
        int answer = numOne - numTwo;
            System.out.println("Subtract: "+answer);
        }
    public static void multiply(int numOne,int numTwo)
        {
        int answer = numOne * numTwo;
            System.out.println("Multiply: "+answer);
        }
    public static void devide(int numOne,int numTwo)
        {
        double answer = numOne / numTwo;
            System.out.println("Devide: "+answer);
        }
}
