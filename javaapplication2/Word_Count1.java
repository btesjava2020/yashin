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

// count the no of letters in a line by using split func.

public class Word_Count1 {
    public static void main(String[] args) {
        String s = "Bebo Technical Education Services";
        String[] s1 = s.split(" ");
        int count=0;
        for (int i=0;i<s1.length;i++)
        {
        System.out.println(s1[i]);
        count++;
        }
        System.out.println("There are "+count+" Words");
        
    }
    
    
    
}
