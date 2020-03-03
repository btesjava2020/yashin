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
public class Pattern_Strng {
    public static void main(String[] args) {
        String s1= "*";
        String s2= "";
        
        for(int i=0;i<5;i++)
        {
            s2=s2.concat(s1);
            System.out.println(s2);
        
        }
        
    }
    
}
