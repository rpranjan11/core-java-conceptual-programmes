/*1.Create a class named Employee that consists following members to       support Employee automation and print the Employee Salary details:-
#.define instance variables to store empCode(string), empName(string),    post(string), basic(double) of the Employee.
#.define constructors to initialise Employee information in corresponding    instance/object variable.
#.define methods to calculate Employee Salary by applying the following    conditions:-
*Dearness Allowance must be 30% of the basic pay if the basic pay is more   than Rs.15000/- per month otherwise @25%.
*House Rent Allowance must be 15% of the basic pay if the basic pay is less   than Rs.10000/- per month otherwise @20%.
*Medical allowance is fixed Rs.2500/- paid to each Employee per month.
*Income Tax is deducted @12% of the Gross/Total salary  only if the gross   salary exceeds Rs.20000/- per month.
#.define method to print stored Employee salary information.
Display the complete functionality
[Make suitable assumption if necessary]                                                      */

import java.util.*;
class Employee{
private String empCode="",empName="",post="";
private double basic;
private final double ma=2500.0;
Employee(){}
Employee(String empCode,String empName,String post,double basic){
this.empCode=empCode;
this.empName=empName;
this.post=post;
this.basic=basic;
}
void accept(String empCode,String empName,String post,double basic){
this.empCode=empCode;
this.empName=empName;
this.post=post;
this.basic=basic;
}
void accept(double basic){
this.basic=basic;
}
double getDa(){
return(basic>15000?basic*30/100:basic*25/100);
}
double getHra(){
return(basic<10000?basic*15/100:basic*20/100);
}
double gross(){
return(basic+getDa()+getHra()+ma);
}
double getItax(){
return(gross()>20000?gross()*12/100:0.0);
}
double getNetSal(){
return(gross()-getItax());
}
void print(){
System.out.println("======Employee Salary Details===dated::"+new Date());
System.out.println("Employee Code			:"+empCode.toUpperCase());
System.out.println("Employee Name			:"+empName.toUpperCase());
System.out.println("Post/Designation			:"+post.toUpperCase());
System.out.println("------------------------------------------------------------------------");
System.out.println("Basic Pay in Rs.			:"+basic);
System.out.println("Dearness allowance in Rs.		:"+getDa());
System.out.println("House Rent allowance in Rs.		:"+getHra());
System.out.println("Medical allowance in Rs.		:"+ma);
System.out.println("Gross/Total Salary in Rs.		:"+gross());
System.out.println("Income Tax deduction in Rs.		:"+getItax());
System.out.println("------------------------------------------------------------------------");
System.out.println("Net Salary in Rs.			:"+getNetSal());
System.out.println("=========================================================");
}
}//close of Employee class
class OEmployee{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("Begin Inserting Employee Information.....");
System.out.print("Enter Employee Code		::");
String empCode=s.nextLine();
//System.out.println(empCode);
System.out.print("Enter Employee Name		::");
String empName=s.nextLine();
//System.out.println(empName);
System.out.print("Enter Employee Post		::");
String post=s.nextLine();
//System.out.println(post);
System.out.print("Enter Basic pay in Rs.		::");
double basic=s.nextDouble();
//System.out.println(basic);
Employee E=new Employee(empCode,empName,post,basic);
E.print();
System.out.print("Enter New Basic pay in Rs.   	::");
basic=s.nextDouble();
//System.out.println(basic);
E.accept(basic);
E.print();
}//close of main
}//close of OEmployee class

// OUTPUT
Begin Inserting Employee Information.....
Enter Employee Code		::e001
Enter Employee Name		::rajnish ranjan
Enter Employee Post		::manager
Enter Basic pay in Rs.		::80000.0
======Employee Salary Details===dated::Fri Jan 08 21:33:58 IST 2016
Employee Code			:E001
Employee Name			:RAJNISH RANJAN
Post/Designation			:MANAGER
------------------------------------------------------------------------
Basic Pay in Rs.			:80000.0
Dearness allowance in Rs.		:24000.0
House Rent allowance in Rs.		:16000.0
Medical allowance in Rs.		:2500.0
Gross/Total Salary in Rs.		:122500.0
Income Tax deduction in Rs.		:14700.0
------------------------------------------------------------------------
Net Salary in Rs.			:107800.0
=========================================================
Enter New Basic pay in Rs.    	       ::100000.0
======Employee Salary Details===dated::Fri Jan 08 21:34:00 IST 2016
Employee Code			:E001
Employee Name			:RAJNISH RANJAN
Post/Designation			:MANAGER
------------------------------------------------------------------------
Basic Pay in Rs.			:100000.0
Dearness allowance in Rs.		:30000.0
House Rent allowance in Rs.		:20000.0
Medical allowance in Rs.		:2500.0
Gross/Total Salary in Rs.		:152500.0
Income Tax deduction in Rs.		:18300.0
------------------------------------------------------------------------
Net Salary in Rs.			:134200.0
=========================================================
