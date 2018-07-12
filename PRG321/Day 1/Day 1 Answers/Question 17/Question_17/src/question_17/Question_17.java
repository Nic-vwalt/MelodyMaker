/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_17;

/**
 *
 * @author Michael
 */
public class Question_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        x=1;
            while(x<=5)
            {
            y=5;
            while(y>=x)
            {
                System.out.print("*");
                y--;
            }
        System.out.println();
        x++;
        }
        }
    }
    

