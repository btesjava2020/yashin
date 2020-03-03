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
public class Calculator {
    
    public static void main(String[] args) {
        char choice;
        
        do {
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiplication");
        System.out.println("4.Devide");
        
        System.out.println("Please Enter first no");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println("Please Enter second no");
        int b = sc.nextInt();
        
        
        System.out.println("Please Enter your operation choice");
        int option = sc.nextInt();
        
            switch(option)
            {
                case 1:
                System.out.println("Adition is"+(a+b));
                break;
                case 2:
                System.out.println("SUBSTRACTION is"+(a-b));
                break;
                case 3:
                System.out.println("Multiplication is"+(a*b));
                break;
                case 4:
                System.out.println("Adition is"+(a/b));
                break;
                default:
                System.out.println("Please enter valid choice");
                break;
                    }
               System.out.print("do you want to continue (y/n)");
        
            choice = sc.next().charAt(0);
          }
        
        
        while(choice=='y' || choice =='Y');    
        
       
        }}

