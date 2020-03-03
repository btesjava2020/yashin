package javaapplication2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Linear_Search {
    
    public static void main(String[] args) {
        
        int[] arr = {12,45,43,44,50,51,34};
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the no to search");
         int no = sc.nextInt();
         
         for(int i=0;i<=arr.length;i++)
         {
             if (no==arr[i])
             {
                 System.out.println("no is found at the position"+i);
                 
         }
             else 
             {
               System.out.println("no not found");  
             }
         }
        
    }
    
}
