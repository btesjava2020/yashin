package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Student {
    
       void sum(int rollno, String name, int marks)
    {
        System.out.println("rollno "+rollno+" name "+name+" marks "+marks);
    }
    public static void main(String[] args) {
     Student obj1 = new Student();
     Student obj2 = new Student();
     Student obj3 = new Student();
     
        obj1.sum(1,"Yashin",100) ; 
        obj2.sum(2,"abcd",110) ; 
        obj3.sum(3,"efghi",120) ; 
    }
    }
