
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
   abstract class Employee {
        
    int empId;
    String empName;
    int total_leaves;
    double total_salary;
    
    Employee(int empId,String empName)
    {
    this.empId=empId;
    this.empName=empName;
    
    }
    abstract void calculate_balance_leaves();
    abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
    abstract void calculate_salary();
    }

    class PermanentEmp extends Employee{
        
    int paid_leave, sick_leave, casual_leave;
    double basic_salary, hra,pfa;
    
    public PermanentEmp(int empId,String empName,double basic_salary) throws IOException {
    super(empId,empName);
    this.basic_salary=basic_salary;
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    paid_leave=10;
    sick_leave=20;
    casual_leave=20;
    System.out.println("This is Permanent Employee ");
    System.out.println("total sick leaves "+sick_leave);
    System.out.println("total casual leaves "+casual_leave);
    System.out.println("total paid leaves "+paid_leave);
        
    }

    void print_leave_details() 
    {
    System.out.println("balance sick leave "+ sick_leave);   
    System.out.println("balance Casual leave "+ casual_leave);
    System.out.println("balance Paid leave "+ paid_leave);
         
    }

    @Override
    void calculate_balance_leaves() 
    {
    total_leaves = paid_leave+sick_leave+casual_leave;
    System.out.println("total balance leaves "+total_leaves);
    }

    @Override
    boolean avail_leave(int no_of_leaves, char type_of_leave)
    {  
    if(type_of_leave=='s' && no_of_leaves<=sick_leave || type_of_leave=='S' && no_of_leaves>=sick_leave)
    {
    sick_leave=sick_leave - no_of_leaves;
    return true;
    }
    else if(type_of_leave=='c' && no_of_leaves<=casual_leave || type_of_leave=='C' && no_of_leaves>=casual_leave)
    {
    casual_leave=casual_leave-no_of_leaves;
    return true;
    }
    else if(type_of_leave=='p' && no_of_leaves<=paid_leave || type_of_leave=='P' && no_of_leaves>=paid_leave)
    {
    paid_leave=paid_leave-no_of_leaves;
    return true;
    }
    else
    {
    return false;
    }
        
    }

    @Override
    void calculate_salary()
    {
    pfa =(12/basic_salary)*100 ;
    hra = (50/basic_salary)*100;
    int deduction= (paid_leave*200);
    total_salary = (basic_salary + hra) - pfa - deduction;
    System.out.println("total salary is "+total_salary);
    }
    
    }
    class TemporaryEmp extends Employee{
    int paid_leave, sick_leave, casual_leave;
    double basic_salary, hra,pfa;
    
    TemporaryEmp(int empId,String empName,double basic_salary)
    {
    super(empId,empName);
    this.basic_salary=basic_salary;
    paid_leave=10;
    sick_leave=15;
    casual_leave=15;
    
    System.out.println("This is Temporary Employee ");
    System.out.println("total sick leaves "+sick_leave);
    System.out.println("total casual leaves "+casual_leave);
    System.out.println("total paid leaves "+paid_leave);
    }
    @Override
    void calculate_balance_leaves()
    {
    total_leaves = paid_leave+sick_leave+casual_leave;
    System.out.println("total balance leaves "+total_leaves);
    System.out.println("balance sick "
            + "leave "+ sick_leave);   
    System.out.println("balance Casual leave "+ casual_leave);
    System.out.println("balance Paid leave "+ paid_leave);
    }

    @Override
    boolean avail_leave(int no_of_leaves, char type_of_leave)
    { 
    if(type_of_leave=='s' && no_of_leaves<=sick_leave || type_of_leave=='S' && no_of_leaves>=sick_leave)
    {
    sick_leave=sick_leave - no_of_leaves;
    return true;
    }
    else if(type_of_leave=='c' && no_of_leaves<=casual_leave || type_of_leave=='C' && no_of_leaves>=casual_leave)
    {
    casual_leave=casual_leave-no_of_leaves;
    return true;
    }
    else if(type_of_leave=='p' && no_of_leaves<=paid_leave || type_of_leave=='P' && no_of_leaves>=paid_leave)
    {
    paid_leave=paid_leave-no_of_leaves;
    return true;
    }
    else
    {
    return false;
    }
    }

    @Override
    void calculate_salary()
    {
    pfa =(12/basic_salary)*100 ;
    hra = (50/basic_salary)*100;
    int deduction= (paid_leave*200);
    total_salary = (basic_salary + hra) - pfa - deduction;
    System.out.println("total salary is "+total_salary);
    }

    }
    class EmployeeMain {
    public static void main(String[] args) throws IOException{
    PermanentEmp pe1=new PermanentEmp(101,"yashin",25000);
    
    System.out.println(pe1.avail_leave(2,'c'));
    pe1.print_leave_details();
    pe1.calculate_balance_leaves();
    pe1.calculate_salary();
    
    PermanentEmp pe2=new PermanentEmp(102,"malik",20256);
    System.out.println(pe2.avail_leave(3,'s'));
    pe2.print_leave_details();
    pe2.calculate_balance_leaves();
    pe2.calculate_salary();
    
    TemporaryEmp pe3=new TemporaryEmp(103,"malik1",15256);
    System.out.println(pe3.avail_leave(3,'s'));
    pe3.calculate_balance_leaves();
    pe3.calculate_salary();
   
    }
    }