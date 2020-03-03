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
    class Animal {
        Animal()
        {
            System.out.println("animal");}
        
    void eat()
    {System.out.println("eating....");}
    }
    class Dog extends Animal
    {
     Dog()
     {
         super();
         System.out.println("Dog");
     }
     Dog(int x)
     {
         super();
         System.out.println("Do");
     }
    void bark()
    {System.out.println("barking....");}
    void work()
    {bark();
    super.eat();
    }
    }
class Cat extends Dog
{
Cat()
{
    super();
}
}
    
    class TestSuper
    {
        public static void main(String[] args) {
            Cat d=new Cat();
            
            d.work();
        }
        }

    

