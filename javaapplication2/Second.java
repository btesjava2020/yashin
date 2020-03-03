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
public class Second {
    
    public static void main(String[] args) {
        
        
        byte a = -5+8*6;
       
        /*
        we can also do this as
         
        byte e = 5;
        byte f = 8;
        byte g = 6;
        byte h =(byte) (-e+f*g);    //type casting from int to byte
        System.out.println(h);
        */
        
        byte b = (55+9)%9;
        byte c = 20+-3*5/8;
        byte d = 5+15/3*2-8%3;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
       
        }}

/*
       logics :

       (1)    a = -5+8*6
                = -5+48 
                = 42
       (2)    b = (55+9)%9
                = 64%9
                = 1
       (3)    c = 20+-3*5/8
                = 20-15/8
                = 20-1
                = 19
       (4)    d = 5+15/3*2-8%3
                = 5+5*2-8%3 
                = 5+5*2-2
                = 5+10-2
                = 15-2
                = 13
        */
