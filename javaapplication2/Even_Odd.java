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
public class Even_Odd {
    public static void main(String[] args) {
        
    System.out.println("enter any no"); 
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n%2==0)
    {
        System.out.println("no is even");
    }
    else 
    {
        System.out.println("no is odd");
    }
    }
}
