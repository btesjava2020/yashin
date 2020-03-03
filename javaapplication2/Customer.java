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
   
    class  Customer {
        
    int acc_no;
    String name;
    float amount;
    
    void insert(int a, String n,float amt)
    {
    acc_no=a;
    name=n;
    amount = amt;        
    }
    
    void deposit(float amt)
    {
    amount=amount+amt;
    System.out.println(amt+" deposited");
    }
    
    void withdraw(float amt)
    {
    if(amount<amt)
    {
    System.out.println("insuficient balance");
    }
    else
    {
    amount= amount-amt;
    System.out.println(amt+" withdrawn");
    }}
    
    void checkbalance()
    {
    System.out.println("balance is "+amount);
    }
    
    void display()
    {
    System.out.println(acc_no+" "+name+" " +amount);
    }
    
    public static void main(String[] args) {
       
    Customer a1 = new Customer();
    Customer a2 = new Customer();
      
    a1.insert(987654,"yaseen", 10000.0f);
    a2.insert(987653,"yashin", 20000.0f);
       
    a1.display();
    a1.checkbalance();
    a1.deposit(4000.0f);
    a1.checkbalance();
    a1.withdraw(6000.0f);
    a1.checkbalance();
       
    a2.display();
    a2.checkbalance();
    a2.deposit(4000.0f);
    a2.checkbalance();
    a2.withdraw(6000.0f);
    a2.checkbalance();
    }
    }

