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
public class Strng_Retrn {

       
        String checknums (int num1 , int num2)
        {
         // String ans = ""; 
        if (num2>num1)
        {
        return "true" ;
        }
        
        else if (num2<num1)
        {
        return "false";
        }
        else 
        {
          return "-1";      
        }
        }    
        
    
    public static void main(String[] args) {
        
      Strng_Retrn obj = new Strng_Retrn();
      System.out.println (obj.checknums(11,12));
      
      /*
      or 
      String a = obj.checknums(10,11);
      System.out.println(a);
      
      */
      

    }
    
}
