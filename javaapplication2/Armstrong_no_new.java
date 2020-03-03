/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class Armstrong_no_new {
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any no ");
        int num = Integer.parseInt(br.readLine());
        int n= num;
        int len = 0,temp,sum=0,pow=1;
        for(;num>0;)
        {
            num=num/10;
        len++;
        }
        num=n;
        // System.out.print(len);
        for(;num>0;)
        {
            temp=num%10;
        for(int j=1;j<=len;j++)
        {
        pow=pow*temp;
        }
        sum=sum+pow;
        pow=1;
        num=num/10;
        }
            System.out.println("sum="+sum);
            if(sum==n)
            {
                System.out.println("no is Armstrong");
            }
        
        else
        {
                System.out.println("no is not Armstrong");
                }
  
    } }
    
    
    

