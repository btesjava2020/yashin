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
       public class EligibilityCheck {
           
       public static void main(String[] args) {
    
         short age = 23;
         char gender = 'm';
        
       /*   System.out.println("enter age");
           Scanner sc = new Scanner(System.in);
           short age= sc.nextShort();
           System.out.println("enter gender");
           char gender = sc.nextLine().charAt(0); */
                   
       
       if (age>=18 && gender=='f' || age>=18 && gender=='F')
       {
           System.out.println("Eligible for marriage");
       }
       else  if (age>=21 && gender=='m' || age>=21 && gender=='M')
       {
           System.out.println("Eligible for marriage");
       }
       else 
       {
           System.out.println("not eligible for marriage");
       }
       
    }   
}
