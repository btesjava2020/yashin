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
public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,15,15,18,7,2,1,18};
        
        int length = arr.length;
        int i,j,k;
        for( i=0;i<length-1;i++)
        {
        for (j=i+1;j<length-1;j++)
        {
        if(arr[i]==arr[j])
        {
            arr[j]=arr[j+1]; 
        }
        }
        
        }
       
        
        for(i=0;i<length-1;i++)
        {
             while(arr[i]!=arr[i+1]){
           System.out.print(arr[i] + " ");
        
             break;
        }
        
        }
       
    }
    
}
