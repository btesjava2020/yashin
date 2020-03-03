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
 //aggregation (Has a relationship)
public class Operation {
    int square (int n)
    {
    return n*n;
    }}
    
    class Square
    {
        Operation op;   //Aggregation
        double area(int radius)
        {
        op=new Operation();
        int rsquare=op.square(radius);
        return rsquare*3.14;
        }
        public static void main(String[] args) {
            Square sq=new Square();
            double result=sq.area(5);
            System.out.println("area of circle is "+result);
            
        }
}
    
    

