/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
//to find highest marks among 3 students by using the concept of array object,constructor and methods

public class Student1 {
   
    //instance variables
    int  reg_id;
    String name;
    float marks;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    Student1() throws IOException{
        System.out.println("Enter RegId");
        reg_id=Integer.parseInt(br.readLine());
        System.out.println("Enter name");
        name=br.readLine();
        System.out.println("Enter marks");
        marks=Float.parseFloat(br.readLine());
       
    }
    //instance methods
    void disp() {
        System.out.println("Reg_Id="+reg_id+" "+"Name="+name+" "+"Marks="+marks);
    }
    static void cal_highest(Student1 stud[]) {
       if(stud[0].marks>stud[1].marks && stud[0].marks>stud[2].marks)
       {
           System.out.println("HIGHEST MARKS : "+"Regd Id "+stud[0].reg_id+" Name "+stud[0].name);
      // return stud[0];
       }
      else if(stud[1].marks>stud[0].marks && stud[1].marks>stud[2].marks)
       {
           System.out.println("HIGHEST MARKS : "+"Regd Id "+stud[1].reg_id+" Name "+stud[1].name);
      //   return stud[1];
       }
       else
       {
           System.out.println("HIGHEST MARKS : "+"Regd Id "+stud[2].reg_id+" Name "+stud[2].name);
       //    return stud[2];
       }
           
    }
   
    public static void main(String[] args)throws IOException {
        //user input
        //Array of Objects
        Student1[] stu=new Student1[3];
        for(int i=0;i<stu.length;i++) {
        stu[i]=new Student1();
        }
        for(int i=0;i<stu.length;i++) {
        stu[i].disp();
        }
        cal_highest(stu);
       
    }

}
    

