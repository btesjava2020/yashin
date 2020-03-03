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
import java.io.IOException;
import java.util.*;
public class Student3_Main_Class {
    
    public static void main(String[] args)throws IOException{
         
    Student3  s1=new Student3();
    Student3  s2=new Student3();
    Student3  s3=new Student3();
                
    ArrayList<Student3> list =new ArrayList<>();
    list.add(s1);
    list.add(s2);
    list.add(s3);
        
    Collections.sort(list,m);
    compareTo(s1,s2);
            
    /*for(Student3 stu:list)
    {
    stu.disp();
    }
               
    Student3.call_highest(list); */
    }
    }