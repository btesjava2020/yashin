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
public class Digits_Pattern {
    public static void main(String[] args) {
        
    
        for(int i=1;i<=5;i++)
        {  
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");   
        }
        for(int k=1;k<=i;k++)
        {
        System.out.print(k);
        }
         for(int k=(i-1);k>=1;k--)
        {
           
        System.out.print(k);
        }
        System.out.println();
        }  
    }
        
}
