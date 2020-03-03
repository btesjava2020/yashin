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
public class Reverse_OfaString {
    public static void main(String[] args) {
        String s1 = "abcba";
        int length = s1.length();
        for(int i=length-1;i>=0;i--)
        {
            char a = s1.charAt(i);
            System.out.print(a);
        }
        System.out.println();
        
    }
    
}
