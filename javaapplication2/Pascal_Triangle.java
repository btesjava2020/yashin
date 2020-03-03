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
public class Pascal_Triangle {
    public static void main(String[] args) {
        int r,i,k,number,j;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of rows");
         r = sc.nextInt();
         
         for(i=0;i<=r;i++)
         {
         for(k=r;k>i;k--)
         {
             System.out.print(" ");
         }
         number = 1;
         for(j=0;j<=i;j++)
         {
             System.out.print(number+" ");
             number = number*(i-j)/(j+1);
           }
             System.out.println();
         }
    }
    
}
