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
public class Adder {
    private void add(byte a,byte b)
    {System.out.println("A");}
    
    }
class Adder1 extends Adder
{

  void add(byte a,byte b)
    {System.out.println("B");}
    
    }
class TestOverloading
{
    public static void main(String[] args) {
       
      //  System.out.println(Adder.add(12.0,12));
      Adder1 a=new Adder1();
        a.add((byte)4,(byte)1);
    }
}
