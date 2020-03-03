package javaapplication2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Print_Table {
    public static void main(String[] args) {
       System.out.println("enter the no."); 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       
    for (int i=1;i<=10;i++)
    {
    int n=x*i;
    System.out.println(x+"x"+i+"="+n);
    
    }
    }
}
