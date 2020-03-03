package javaapplication2;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Set_Implementation {
    public static void main(String[] args) {
        HashSet<Integer> hset=  new HashSet<>();
        hset.add(5);
        hset.add(2);
        hset.add(96);
        hset.add(36);
        hset.add(9);
        System.out.println(hset);
        
        TreeSet<Integer> tset=new TreeSet<>();
        tset.add(5);
        tset.add(2);
        tset.add(9);
        tset.add(36);
        tset.add(96);
        System.out.println(tset);
            
        System.out.println(hset.equals(tset));
        
        HashSet<Integer> hset1=  new HashSet<>();
        hset1.add(12);
        hset1.add(2);
        hset1.add(15);
        hset1.add(3);
        hset1.add(15);
       
        System.out.println(hset1);
        
        TreeSet<Integer> tset1=new TreeSet<>();
        tset1.add(12);
        tset1.add(2);
        tset1.add(15);
        tset1.add(3);
        tset1.add(15);
      
        System.out.println(tset1);
            
        System.out.println(hset1.equals(tset1));
        
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        
        lhs.add(12);
        lhs.add(2);
        lhs.add(15);
        lhs.add(3);
        lhs.add(15);
        System.out.println(lhs);
        System.out.println(lhs.equals(tset1));
        System.out.println(lhs.equals(hset1));
        
    }
    
}
