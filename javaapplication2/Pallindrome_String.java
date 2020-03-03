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
public class Pallindrome_String {
    
     public static void main(String[] args) {
        String s1 = "Abcba";
        String s2 = "";
        int length = s1.length();
        for(int i=length-1;i>=0;i--)
        {
           s2 = s2+s1.charAt(i);
            
            }
                     
        if (s1.equalsIgnoreCase(s2))
        {
        System.out.println("String is palindrom");
        }
        else
        {
        System.out.println("String is not palindrom");
        }
        
    }
    
}
