package javaapplication2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Student2 {
    
    //instance variables
    int reg_id;
    String name;
    float marks;
   
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Student2() throws IOException{
       System.out.println("Enter RegId");
        reg_id=Integer.parseInt(br.readLine());
        System.out.println("Enter name");
        name=br.readLine();
        System.out.println("Enter marks");
        marks=Float.parseFloat(br.readLine());
    }
    //instance methods
    void disp() {
        System.out.println("Reg_Id= "+reg_id+" "+"Name= "+name+" "+"Marks= "+marks);
    }
    public static void main(String[] args) throws IOException {
        //user input
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        Student2 s3=new Student2();
        s1.disp();
        s2.disp();
        s3.disp();
       

    }

}

