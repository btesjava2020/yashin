/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Jagged_Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
               arr[0]=new int [4];
               arr[1]=new int [3];
               arr[2]=new int [2];
                     
        for (int i=0;i<arr.length;i++){
            System.out.println("enter elements of row " +(i+1));
            for(int j=0;j<arr[i].length;j++)
            {
              Scanner sc=new Scanner(System.in);
              arr[i][j]=sc.nextInt();
    }
        }
        System.out.println();
        System.out.println("The matrix you entered is ");
         for (int i=0;i<arr.length;i++)
         {
            
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+ " ");
                   }
             System.out.println();
        }
    
}}
