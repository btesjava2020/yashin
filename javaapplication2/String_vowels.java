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
public class String_vowels {
    
    public static void main(String[] args) {
       
        int count=0;
        int i;
        String s = "MoHaMmAd";
        for(i=0;i<s.length();i++)
        {
            char a = s.charAt(i);
        if(a=='a' ||a=='A'||a=='e'||a=='E'||a=='I'||a=='i'||a=='O'||a=='o'||a=='u'||a=='U') 
            
        {
            count++;  
        }}
        System.out.println("There are "+count+" vowels");
    }
    
    
}
