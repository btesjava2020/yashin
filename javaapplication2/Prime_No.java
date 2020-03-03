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
public class Prime_No {
    public static void main(String[] args) {
       // int i=1;
        System.out.println("1 is not prime no");
        for( int i=2;i<=100;i++)
            
        {
            if(i%2==0 && i>2 || i%3==0 && i>3 || i%5==0 && i>5 || i%7==0 && i>7) 
            {
                System.out.println(i + "is prime not prime");
                             
            }
            else{
             System.out.println(i + "is a prime no");
             
            }
            
        }
        
        }
    }
    

