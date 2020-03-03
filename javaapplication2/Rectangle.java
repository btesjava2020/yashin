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
public class Rectangle {
    
    public static void main(String[] args) {
      
    double width = 5.6;
    double height = 8.5;
    float area= (float)(width*height);
    System.out.println("Area is 5.6 * 8.5 = " + area);
    float perimeter = (float)(2*(width+height));
    System.out.println("Perimeter is 2*(5.6 + 8.5) = " + perimeter);
    
    /* we can also do it as :
    
    float width = 5.6f;
    float height = 8.5f;
    float area= width*height;
    System.out.println("Area is 5.6 * 8.5 = " + area);
    float perimeter = 2*(width+height);
    System.out.println("Perimeter is 2*(5.6 + 8.5) = " + perimeter);
  */
    }}

    /* 
    logic and output:

   by taking values in float
   float  area = 5.6 * 8.5 = 47.6
   float  perimeter = 2*(5.6 + 8.5)
                    = 2*(14.1)
                    = 28.2

      by taking area variable as double

      double  area = 5.6 * 8.5 = 47.599999999999994
      float  perimeter = 2*(5.6 + 8.5)
                     = 2*(14.1)
                     = 28.2
    */

  

