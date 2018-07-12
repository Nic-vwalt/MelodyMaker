/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_5;

/**
 *
 * @author Michael
 */
public class Question_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int[] a={5,9,12,1,2,3,8,4};
  int temp;
  for(int i=0; i<=a.length-1;i++)
    {
         for( int j=0; j<=a.length-2;j++)
         {
               if(a[j]<a[j+1])
               {
                      temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
               }
          }
  }
  
   for(int num:a)  //Assign each value in array to variable on the left
  {
           System.out.println(num);
   }
    }
    
}
