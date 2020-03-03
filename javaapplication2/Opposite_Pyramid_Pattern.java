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
public class Opposite_Pyramid_Pattern {
    public static void main(String[] args) {
      
        int a=7;
                for(int i=0;i<=3;i++)
        {
           for(int j=0;j<i;j++)
           {
               System.out.print(" ");
           }
           
           for(int k=i+1;k<=a;k++)
               
           {
               System.out.print((2*k));
           }
           a=a-1;
            System.out.println();
        }
    }}
    
    
