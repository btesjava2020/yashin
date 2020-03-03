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
        public class Armstrong_no {
            
        public static void main(String[] args) {
            
         System.out.println("enter any no"); 
         Scanner sc =new Scanner(System.in);
         String number = sc.nextLine();
         int length = number.length();
         int n= Integer.parseInt(number);
         
    
         int rev=0;
         int temp =n;
         
         while (n>0)  
    {
       
    int rem = n%10;
    rev = (int) (rev + Math.pow(rem,length));
    n=n/10;
    }
    if(rev==temp){
        System.out.println("no is armstrong ");
    }
    else
    {
       System.out.println("no is not armstrong ");     
    }
    
    }
    
}
