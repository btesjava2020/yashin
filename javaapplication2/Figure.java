/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
abstract class Figure {
    double dim1;
    Figure()
    {
        dim1=10;
            }
    
 abstract void findArea();

 abstract void findPerimeter();
}
class Circle extends Figure
{
 @Override
 void findArea()
 {
    double area=3.14*dim1*dim1;
     System.out.println("Area of Circle is "+area);
     
 }
 @Override
 void findPerimeter()
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
class Rectangle extends Figure
{
    double dim2;

    public Rectangle() {
        dim2=20;
    }
    
 @Override
 void findArea()
 {
 double area=dim1*dim2;
     System.out.println("area of Rectangle is "+area);
 }

 @Override
 void findPerimeter()
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
class Triangle extends Figure
{
    double dim2, dim3;

    public Triangle() {
        dim2=20;
        dim3=30;
    }
    
 @Override
 void findArea()
{
    double area = (dim2*dim3)/2;
System.out.println("area of triangle is "+area);
}

 @Override
void findPerimeter()
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
class Test{
    public static void main(String[] args) {
        Circle c1=new Circle();
      //  Circle c2=new Circle();
        
        c1.findArea();
        c1.findPerimeter();
        System.out.println(c1.toString());
        
        Rectangle r1=new Rectangle();
      //  Rectangle r2=new Rectangle();
        
        r1.findArea();
        r1.findPerimeter();
        System.out.println(r1.toString());
        
        Triangle t1=new Triangle();
       // Triangle t2=new Triangle();
        
        t1.findArea();
        t1.findPerimeter();
        System.out.println(t1.toString());
        
    }
}