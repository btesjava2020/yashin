
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
public class OneD_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] name = new String[10];
        int count = name.length;
        for(int i=0;i<count;i++){
            System.out.println("Enter Name");
            name[i]=sc.nextLine();
        }
        System.out.println("Names are ");
        for(int i=0;i<count;i++){
            System.out.println(name[i]);
        }
    }
    
}
