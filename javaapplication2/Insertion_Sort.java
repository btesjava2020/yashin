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
public class Insertion_Sort {
    public static void main(String[] args) {
        
    
    int i,j,k,temp;
    int arr[] = new int[10];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements of array");
    for (i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
        for(j=0;j<i;j++)
        {
        if (arr[i]<arr[j])
        {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }}
         for(k=0;k<arr.length;k++)
         {
             System.out.print(arr[k]+"\t");
         }
         System.out.println();
        }
    
    
    }
    }
    

