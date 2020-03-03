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
public class Print_Prime {
    
    public static void main(String[] args) {
        int prim=0;
        for (int i=2;i<=100;i++)
        {
            boolean isPrime=true;
        for (int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                isPrime=false;
                break;
            }
            
            }
        if(isPrime)
        {
            prim++;
            System.out.println("prime no"+i);
        }
        else
        {
            System.out.println("Non Prime Num "+i);
        }
                
    }
      System.out.println(prim);      
                
    }
    }
    
