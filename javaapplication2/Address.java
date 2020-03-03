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
// Aggregation (Has a relationship)
public class Address {
    String city,state,country;

     Address(String city, String state, String country) {
    
    this.city=city;
    this.state=state;
    this.country=country;
    }}
     
     class Employee1{
       int id;
       String name;
       Address address; //Aggregation
       
        public Employee1(int id , String name,Address address) {
           this.id=id;
           this.name=name;
           this.address=address;
        }
        
     
     void display()
    {
        
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public static void main(String[] args) {
        Address address1 =new Address("Gharuan","Punjab","India");
        Address address2=new Address("Kharar","Punjab","India");
        
        Employee1 e1=new Employee1(1,"yashin",address1);
        Employee1 e2 = new Employee1(2,"yaseen",address2);
        e1.display();
        e2.display();
       
    } 
}
 

