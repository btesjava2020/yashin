package javaapplication2;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Stack_Implementation {
    public static void main(String[] args) {
        Stack<String> stack1=new Stack<>();
        stack1.push("yashin");
        stack1.push("Malik");
        stack1.push("Qamar");
        stack1.push("Nehal");
        stack1.push("Anshul");
        stack1.push("Vivek");
       
        if(stack1.empty())
            System.out.println("Stack_underflow");
        else{
        stack1.forEach(str ->
        {
            System.out.println(str);
        });}
        
         
        Iterator<String> itr=stack1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
      ListIterator<String> itr1=stack1.listIterator(stack1.size());
        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }
        
        System.out.println(stack1.empty());
        while(!stack1.isEmpty()){
        System.out.println(stack1.pop());
        }
        
        System.out.println(stack1.empty());
        
        itr.forEachRemaining(str1 ->
        {
            System.out.println(str1);
        });
    }}
    

