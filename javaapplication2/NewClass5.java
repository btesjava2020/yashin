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
    class NewClass5 {
    int rollno;
    String name;
    static String college = "ait";
    
     static void change()
    {
     
    college = "adesh";
    }
    NewClass5(int r, String name )
    {
    rollno=r;
    this.name = name;
    
    }
    final void disp()
    {
        System.out.println("rollno "+rollno+ " name "+name+" college "+college);
    }
    
    public static void main(String[] args) {
        
        change();
        
        NewClass5 s1 = new NewClass5(1,"yaseen");
        NewClass5 s2 = new NewClass5(2,"yashin");
        NewClass5 s3 = new NewClass5(3,"abc");
        s1.disp();
        s2.disp();
        s3.disp();
        
        
    }
    
}

