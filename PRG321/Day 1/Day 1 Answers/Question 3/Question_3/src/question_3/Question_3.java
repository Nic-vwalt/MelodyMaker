/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_3;

/**
 *
 * @author Michael
 */
import java.io.*;
public class Question_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int remain,sum=0,temp;    
  int num=121;  
  
  temp=num;    
  while(num>0){    
   remain=num%10;    
   sum=(sum*10)+remain;    
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("Palindrome Number ");    
  else    
   System.out.println("Not Palindrome Number");    
}  
    }
    
