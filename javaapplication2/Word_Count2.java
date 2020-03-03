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
public class Word_Count2 {
    public static void main(String[] args) {
         String s1 = "Bebo Technical Education Services ";
        String s2;
        String s3 = "";
        int count=0;
        int length = s1.length();
        
        for (int i=0;i<length;i++)
        {
          s2 = String.valueOf(s1.charAt(i));
          s3= s3.concat(s2);
          if(s2.equals(" "))
          {
              System.out.println(s3); 
              count++;
              s3 = ""; 
          }}
        
            System.out.println("There are "+count+" Words");
        
        }
    }

    

