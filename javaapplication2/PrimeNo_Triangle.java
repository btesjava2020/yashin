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
public class PrimeNo_Triangle {
    public static void main(String[] args) {
        int count;
        boolean flag;
        for (int i=1;i<=8;i++)
        {
            count =1 ;
           
        for (int j=1;j<(2*i);j++)
        {
             flag=true;
            for(int k=2;k<j;k++)
            {
                if(j%k==0)
                {
                flag=false;
                break;
            }}
             if(flag==true && count<=i)
        {
              System.out.print(j);
              count++;
       
            }}
          
         System.out.println(); 
         }
        }
        
    }
