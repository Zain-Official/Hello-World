/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Hp
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        for(int i=1; i<=6; i++)
        {
          for(int j=1; j<=i; j++)
          {
          System.out.print(j);
          }
          
          for(int k=6; k>i; k--)
          {
              System.out.print("*");
          
          }
          System.out.println();
        
        }
        
        
    }
    
}
