/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author hp
 */
public class Digits_Triangle3 {
    
     public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            
        for(int j=1;j<=i;j++)
        {
           if(i%2!=0 && j%2!=0  || i%2==0 && j%2==0)
           {
            System.out.print("1");
           }
           else 
          {
          System.out.print("0");
           }
        }
        System.out.println();
        }}
}

/*  or
if(i%2!=0 && j%2!=0  || i%2==0 && j%2==0)
           {
            System.out.print("1");
           }
           else if(i%2==0 && j%2!=0 || i%2!=0 && j%2==0)
          {
          System.out.print("0");
           }
*/