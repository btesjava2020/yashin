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
public class Basic {
    public static void main(String[] args) {
        int[] a ={5,1,15,20,25};
        int i,j,m;
        i=++a[1];
        j=a[1]++;
        m=a[i++];
        System.out.println(i+" "+j+" "+m);
    }
    
}
