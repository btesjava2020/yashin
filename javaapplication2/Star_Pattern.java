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
public class Star_Pattern {
    
    public static void main(String[] args) {
        
     
       //optimized
       for(int i=1;i<=5;i++)
        {  
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");   
        }
        for(int k=1;k<(2*i);k++)
        {
        System.out.print("*");
        }
        System.out.println();
        }}
    
    
    /* complex
       
         for(int i=1;i<=5;i++)
        {  
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");   
        }
        for(int k=1;k<=i;k++)
        {
        System.out.print("*");
        }
        for(int l=1;l<=(i-1);l++)
        {
            if(i==1){
                System.out.print(" ");
            }
            else{
        System.out.print("*");
        }}

        System.out.println();
        }}
*/
    
}
