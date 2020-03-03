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
public class Frequency_Count {
    public static void main(String[] args) {
        
        long num = 9877809651L;
        long n=num;
        int[] freq=new int[10];
        int rem;
        int i;
        for(i=0;i<10;i++)
            
        {
        freq[i]=0;
        }
        
        while(num!=0)
        {
        rem=(int)num%10;
        freq[rem]++;
        num=num/10;
        }
        for(i=0;i<10;i++)
        {
         if(freq[i]!=0)
         {
            System.out.println("frequency of "+i+" = "+freq[i]);             
        }
         }
        
        }  }
