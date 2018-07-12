/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_16;

/**
 *
 * @author Michael
 */
import java.util.Scanner;
public class Question_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double discount =0;
         double rev =0;
        double afterdisc = 0;
    Scanner in = new Scanner(System.in);
        System.out.println("Enter Unit Price: ");
        double unitPrice = Integer.parseInt(in.nextLine());
        System.out.println("Enter Quantity: ");
        double quantity = Integer.parseInt(in.nextLine());
        
        if (quantity >100 && quantity <120) {
            discount = 0.1;
           
        }
        else
            if (quantity > 120) {
                discount = 0.15;
            }
        else{
            discount = 0;
            }
        rev = unitPrice * quantity;
        afterdisc = rev - ((unitPrice * quantity) *discount);
        System.out.println("The revenue from sale: "+rev);
        System.out.println("After Discount: "+afterdisc);
        
    }
    
}
