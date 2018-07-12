/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_10;

/**
 *
 * @author Michael
 */
public class Question_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            		for(int i = 1; i <= 3; i++) {
    			for(int j = 1; j <= i; j++) {
    				System.out.print("*");
    			}
    			System.out.println();			
    		}
    		
    		for(int x = 1; x <= (3+1) ; x++) {
    			System.out.print("*");
    		}
    		System.out.println();		
    		
    		for(int n = 3; n >= 1; n--) {
    			for(int q = 1; q <= n; q++) {
    				System.out.print("*");
    			}
    			System.out.println();			
    		}		
    }
    
}
