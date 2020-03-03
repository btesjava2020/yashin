package javaapplication2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class List_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> lis =new ArrayList<>();
        lis.add(100);
        lis.add(130);
        lis.add(150);
        
        ArrayList<Integer> list1 =new ArrayList<>(lis);
        
        //List1 will be initialized with the lis
        list1.add(10);
        list1.add(13);
        list1.add(15);
        list1.add(25);
        list1.add(11);
        
        ListIterator itr=list1.listIterator();
        
     /*  for(int record :list1)
        {
        //to print in forward direction    
        System.out.println(record);
        }*/
        while(itr.hasNext())
        {
        itr.next();
        }
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
        
                 
    }
    
}
