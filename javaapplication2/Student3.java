package javaapplication2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
    public class Student3
    {
     int  reg_id;
     String name;
     float marks;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    Student3() throws IOException
    {
    System.out.println("Enter RegId");
    reg_id=Integer.parseInt(br.readLine());
    System.out.println("Enter name");
    name=br.readLine();
    System.out.println("Enter marks");
    marks=Float.parseFloat(br.readLine());
    }
    
    void disp()
    {
    System.out.println("Reg_Id="+reg_id+" "+"Name="+name+" "+"Marks="+marks);
    }
    
    /*static void call_highest(ArrayList<Student3> study)
    {
    float maxMarks=0;
    Student3 topStudent=null;
    for(int i=0;i<study.size();i++)
    {       
    if(study.get(i).marks>maxMarks)
    {
    maxMarks=study.get(i).marks;
    topStudent=study.get(i);
    } 
    }
    if(topStudent!=null)
    {
    System.out.print("Highest marks: ");
    topStudent.disp();
    }
    } */ 
    }
    

