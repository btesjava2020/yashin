/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Fibonacci {
    
    public static void main(String[] args)
    {
       
    System.out.println("enter any no"); 
    Scanner sc =new Scanner(System.in);
    int term = sc.nextInt();
    
    int first =0;
    int second = 1;
    System.out.print(first +" "+ second+" ");
        
   for (int i=3; i<=term;i++)
   {
   int result = first+second;
   System.out.print(result+ " ");
   
   first=second;
   second=result;
     
   }  
   }
   
}
