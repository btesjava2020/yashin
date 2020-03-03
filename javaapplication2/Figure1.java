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
    abstract class Figure1 {
    
    double dim1;
    BufferedReader br;
    Figure1()
    {
      br=new BufferedReader(new InputStreamReader(System.in));
 // dim1=10;
    }
    
    abstract void findArea1();
    abstract void findPerimeter1();
    }
    class Circle1 extends Figure1
    {
    Circle1() throws IOException {
        
    dim1=Double.valueOf(br.readLine()); 
    }
    
    @Override
    void findArea1()
    {
    double area=3.14*dim1*dim1;
    System.out.println("Area of Circle is "+area);  
    }
    @Override
    void findPerimeter1()
    {
    double perimeter=2*3.14*dim1;
    System.out.println("perimeter of Circle is "+perimeter);
    }
    @Override
    public String toString()
    {
    return "this is Circle class";
    }
    }
    class Rectangle1 extends Figure1 
    {
    double dim2;
    public Rectangle1() throws IOException{
 // dim2=20;
     
    System.out.println("enter length of rectangle ");
    dim1=Double.valueOf(br.readLine());
    System.out.println("enter breadth of rectangle ");
    dim2=Double.valueOf(br.readLine()); 
    }
    
    @Override
    void findArea1()
    {
    double area=dim1*dim2;
    System.out.println("area of Rectangle is "+area);
    }

    @Override
    void findPerimeter1()
    {
    double perimeter=2*(dim1+dim2);
    System.out.println("perimeter of rectangle is "+perimeter);
    }
    @Override
    public String toString()
    {
    return "this is Rectangle class";
    }
    }
    class Triangle1 extends Figure1
    {
    double dim2, dim3;

    public Triangle1() throws IOException {
 // dim2=20;
 // dim3=30;
    System.out.println("enter base of triangle ");
    dim1=Double.valueOf(br.readLine());
    System.out.println("enter height of triangle ");
    dim2=Double.valueOf(br.readLine());
    dim3=dim2;
    }
    
    @Override
    void findArea1()
    {
    double area = (dim1*dim2)/2;
    System.out.println("area of triangle is "+area);
    }

    @Override
    void findPerimeter1()
    {
    double perimeter = dim1+dim2+dim3;
    System.out.println("perimeter of triangle is "+perimeter);
    }
    
    @Override
    public String toString()
    {
    return "this is Triangle class";
    }
    }
    class Test1{
    public static void main(String[] args) throws IOException{
        
      /*  Figure1[] fig=new Figure1[6];
        for(int i=0;i<=fig.length;i++)
        {
        if(i<=1)
        fig[i]=new Circle1();
            
        else if(i>1&& i<=3 )
        {
        fig[i]=new Rectangle1();
        fig[i].findArea1();
        fig[i].findPerimeter1();
        System.out.println(fig[i].toString());
        }
        else if(i>3&&i<=5)
        {
        fig[i]=new Triangle1(); 
        fig[i].findArea1();
        fig[i].findPerimeter1();
        System.out.println(fig[i].toString());
        }}*/
        
         
    Circle1[] cr=new Circle1[2];
    for(int i=0;i<cr.length;i++)
    {
    System.out.println("enter radius of circle "+(i+1));
    cr[i]=new Circle1();
    cr[i].findArea1();
    cr[i].findPerimeter1();
    System.out.println(cr[i].toString());
    }
    
    Rectangle1[] rec=new Rectangle1[2];
    for(int i=0;i<rec.length;i++)
    {
    rec[i]=new Rectangle1();
    rec[i].findArea1();
    rec[i].findPerimeter1();
    System.out.println(rec[i].toString());    
    }
    
    Triangle1[] tri=new Triangle1[2];
    for(int i=0;i<tri.length;i++)
    {
    tri[i]=new Triangle1();
    tri[i].findArea1();
    tri[i].findPerimeter1();
    System.out.println(tri[i].toString());
    }
    
        
     /* Circle1 cr1=new Circle1();
        Circle cr2=new Circle();
        
        cr1.findArea1();
        cr1.findPerimeter1();
        System.out.println(cr1.toString());
        
        Rectangle1 rec1=new Rectangle1();
        Rectangle rec2=new Rectangle();
        
        rec1.findArea1();
        rec1.findPerimeter1();
        System.out.println(rec1.toString());
        
        Triangle1 tri1=new Triangle1();
        Triangle tri2=new Triangle();
        
        tri1.findArea1();
        tri1.findPerimeter1();
        System.out.println(tri1.toString());
        */
    }
    }
    

