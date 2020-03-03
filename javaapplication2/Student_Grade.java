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
public class Student_Grade {
    int rollno ;
    String name;
    char grade;
    float engMarks,mathMarks,sciMarks,totalMarks;
    float average;
     
    Student_Grade(int rollno, String n, float em,float mm,float sm)
    {
    
    this.rollno=rollno;
    name=n;
    engMarks =em;
    mathMarks =mm;
    sciMarks =sm;
    }
    void total()
    {
    totalMarks = engMarks+mathMarks+sciMarks;
    }
    void average()
    {
    average = totalMarks/3;
    }
    void grade()
    {
    if(average>=80)   
    System.out.println(rollno+ " "+name+" grade A");
    else if (average>=70)
    System.out.println(rollno+ " "+name+" grade B");
    else if (average>=50)
    System.out.println(rollno+ " "+name+" grade C");
    else if (average>=33)
    System.out.println(rollno+ " "+name+" grade D");
    else
    System.out.println(rollno+ " "+name+" grade fail");
        
    }
    
    public static void main(String[] args) 
    {
    Student_Grade s1 = new Student_Grade( 1,"yashin",88,89,80);
    Student_Grade s2 = new Student_Grade( 2,"Def",78,80,56);
    Student_Grade s3 = new Student_Grade( 3,"Sam",85,69,65);  
   
    s1.total();
    s1.average();
    s1.grade();
        
    s2.total();
    s2.average();
    s2.grade();
        
    s3.total();
    s3.average();
    s3.grade();
    
    } 
    }
