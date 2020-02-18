// Defining superclass Employee
class Employee{
private String ename,address,emailId;
private long mobNo;
protected Employee(){
ename=address=emailId="";
}
protected Employee(String ename,String address,String emailId,long mobNo){
this.ename=ename;
this.address=address;
this.emailId=emailId;
this.mobNo=mobNo;
}
protected void input(String ename,String address,String emailId,long mobNo){
this.ename=ename;
this.address=address;
this.emailId=emailId;
this.mobNo=mobNo;
}
protected void output(){
System.out.println("Employee Name	::"+ename.toUpperCase());
System.out.println("Address		::"+address.toUpperCase());
System.out.println("Email Id		::"+emailId);
System.out.println("Mobile No		::"+mobNo);
}
}//close of superclass Employee

//Defining subclass FullTime
class FullTime extends Employee{
private String ecode,epost;
private double salary;
FullTime(){
ecode=epost="";
}
FullTime(String ename,String address,String emailId,long mobNo,String ecode,String epost,double salary){
super(ename,address,emailId,mobNo);
this.ecode=ecode;
this.epost=epost;
this.salary=salary;
}

void input(String ename,String address,String emailId,long mobNo,String ecode,String epost,double salary){
input(ename,address,emailId,mobNo);
this.ecode=ecode;
this.epost=epost;
this.salary=salary;
}
public void output(){
System.out.println("=========Displaying FullTime Employee Information=====");
System.out.println("Employee Code			::"+ecode.toUpperCase());
super.output();
System.out.println("Employee Post/Designation		::"+epost.toUpperCase());
System.out.println("Salary in Rs.			::"+salary);
System.out.println("==========================================================");
}
}//close of subclass FullTime

class PartTime extends Employee{
private double dwages;
PartTime(){}
PartTime(String ename,String address,String emailId,long mobNo,double dwages){
super(ename,address,emailId,mobNo);
this.dwages=dwages;
}

void input(String ename,String address,String emailId,long mobNo,double dwages){
input(ename,address,emailId,mobNo);
this.dwages=dwages;
}
public void output(){
System.out.println("=========Displaying PartTime Employee Information=====");
super.output();
System.out.println("Daily Wages in Rs.			::"+dwages);
System.out.println("========================================================");
}
}//close of subclass PartTime
class EmpInfo{
public static void main(String args[]){
FullTime F=new FullTime("Amit Kumar","C-64, Bank Road, Patna-1","amit.patna@gmail.com",958866551,"E001","Manager",65000);
PartTime P=new PartTime("Vinay Singh","D-105, Police Colony, Bank Road, Patna-1","vinay1@yahoo.com",938168725,600);
Employee E;
E=F;
E.output();
E=P;
E.output();
}//close of main()
}//close of EmpInfo class

/* OUTPUT
=========Displaying FullTime Employee Information=====
Employee Code			::E001
Employee Name	::AMIT KUMAR
Address		::C-64, BANK ROAD, PATNA-1
Email Id		::amit.patna@gmail.com
Mobile No		::958866551
Employee Post/Designation		::MANAGER
Salary in Rs.			::65000.0
==========================================================
=========Displaying PartTime Employee Information=====
Employee Name	::VINAY SINGH
Address		::D-105, POLICE COLONY, BANK ROAD, PATNA-1
Email Id		::vinay1@yahoo.com
Mobile No		::938168725
Daily Wages in Rs.			::600.0
========================================================
*/
