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
public class Pallindrom_Reverse {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abcb");
        StringBuffer sb1 = new StringBuffer(sb);
        
        if(sb1.equals(sb.reverse()))
        {
            System.out.println("no is pallindrom");
        }
        else
        {
        System.out.println("no is not pallindrom");
        }
        
    }
    
}
