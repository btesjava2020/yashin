package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Multiple {
    
    public static void main(String[] args) {
        
         int n = 15;
         
         if(n%3==0 && n%5==0)
         {
         System.out.println(" fizz , buzz");
         }
         else if(n%3==0)
         {
         System.out.println(" fizz ");
         }
          else if(n%5==0)
         {
         System.out.println(" buzz ");
         }
         else
         {
         System.out.println("no is neither devideable by 3 nor devideable by 5");
         }
     }
}
