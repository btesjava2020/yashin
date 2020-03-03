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
public class Switch_Marks {
    
     public static void main(String[] args) {
     
     int grade = 77;
     int marks = grade/10;
     
     switch(marks)
             {
             case 10:
             case 9:
             case 8:
             System.out.println("Exelent");
             break;
             case 7:
             System.out.println("very good");
             break;
             case 6:
             case 5:
             System.out.println(" good");
             break;
             case 4:
             System.out.println("average");
             break;
             case 3:
             case 2:
             case 1:
             System.out.println("fail");
             default:
             System.out.println("invalid choice");
              
          }   
     }
}
