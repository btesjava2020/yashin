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
public class Bubble_Sort {
    
    static void sort(int[] arr)
    {
    for(int i=0;i<arr.length;i++)
    {
         for(int j=0;j<arr.length-1;j++)
         {
         if(arr[j]>arr[j+1])
         {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
         }
         }
         }
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    }
            
    public static void main(String[] args) {
      int [] arr={54,7,73,4,32};   
      sort(arr);
      
    }
    
}
