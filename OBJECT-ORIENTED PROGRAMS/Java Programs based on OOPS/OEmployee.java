/* 1.Create a class named Employee that consists following members to store and print the Employee Salary details:-
#.instance variables:-ecode(string), ename(string), post(string), ebasic(double) to store Employee details.
#.methods:-
*void input(string,string,string,double):-method to accept four arguments respectively ecode(string), ename(string), post(string), ebasic(double).
*double gda():-method to calculate Dearness Allowance 
*double ghra():-method to calculate House Rent Allowance
*double gross():-method to calculate Gross/Total Salary
*double gitax():-method to calculate Income Tax
*double gnetsal():-method to calculate Net Salary
*void print():-method to print stored Employee salary details
Display the complete functionality
                   /OR
Write main() method, instantiate object and call all method exactly once.
[Make suitable assumption if necessary]                                                   */

import java.util.*;
class Employee{
private String ecode,ename,epost;
private double ebasic;
void input(String eid, String name, String post, double basic){
ecode=eid;
ename=name;
epost=post;
ebasic=basic;
}
double gda(){
return(ebasic*30/100);
}
double ghra(){
double hra=ebasic*20/100;
return(hra);
}
double gross(){
return(ebasic+gda()+ghra());
}
double gitax(){
return(gross()*12/100);
}
double gnetsal(){
return(gross()-gitax());
}
void print(){
System.out.println("= = = Employee Salary Details = = = Dated :"+new Date());
System.out.println("Employee Code :"+ecode);
System.out.println("Employee Name :"+ename);
System.out.println("Post/Designation :"+epost);
System.out.println("Basic Pay in Rs. :"+ebasic);
System.out.println("Dearness Allowance in Rs. :"+gda());
System.out.println("House Rent Allowance in Rs. :"+ghra());
System.out.println("= = = = = = = = = = = = = = = = = =");
System.out.println("Gross/Total Salary in Rs. :"+gross());
System.out.println("Income Tax Deduction in Rs. :"+gitax());
System.out.println("= = = = = = = = = = = = = = = = = =");
System.out.println("Net Salary in Rs. :"+gnetsal());
}
}//Close of class Employee
class OEmployee{
public static void main(String args[]){
Scanner A=new Scanner(System.in);
Employee E=new Employee();
System.out.println();
System.out.print("Enter Employee ecode ::");
String ecode=A.nextLine().toUpperCase();
//System.out.println(ecode);
System.out.print("Enter Employee name ::");
String ename=A.nextLine().toUpperCase();
//System.out.println(ename);
System.out.print("Enter Post/Designation ::");
String epost=A.nextLine().toUpperCase();
//System.out.println(epost);
System.out.print("Enter Basic pay in Rs. ::");
double ebasic=A.nextDouble();
//System.out.println(ebasic);
E.input(ecode,ename,epost,ebasic);
E.print();
}//Close of main
}//Close of class OEmployee

///OUTPUT

Enter Employee ecode ::E001
Enter Employee name ::RAJNISH RANJAN
Enter Post/Designation ::MANAGER
Enter Basic pay in Rs. ::100000.0
= = = Employee Salary Details = = = Dated :Tue Jan 05 20:01:51 IST 2016
Employee Code :E001
Employee Name :RAJNISH RANJAN
Post/Designation :MANAGER
Basic Pay in Rs. :100000.0
Dearness Allowance in Rs. :30000.0
House Rent Allowance in Rs. :20000.0
= = = = = = = = = = = = = = = = = =
Gross/Total Salary in Rs. :150000.0
Income Tax Deduction in Rs. :18000.0
= = = = = = = = = = = = = = = = = =
Net Salary in Rs. :132000.0
