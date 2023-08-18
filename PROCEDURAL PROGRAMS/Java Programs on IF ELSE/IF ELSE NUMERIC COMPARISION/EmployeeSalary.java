/*6.Write a java application to accept Employee code , Employee name, post and basic pay of the Employee. Calculate dearness allowance(i:e; da) @ 30% of the basic pay if basic pay is more than Rs. 10000/- otherwise @ 25%.
Similarly calculate house rent allowance(i:e; hra) @ 15% of the basic if basic pay is less than Rs. 8000/- otherwise @ 20%. Medical allowance is fixed Rs. 2500/- paid to each employee per month. Calculate and display Employee Salary details in the following fashion as income tax is to be deducted @ 12% of the gross/total salary:-
           =====Employee Salary Details===dated:..................
           Employee Code		:...........                                   
           Employee Name		:...........                                  
           Post/Designation 		:...........                                  
           Basic Pay in Rs. 		:...........                                    
           Dearness allowance in Rs. 	:...........
           House Rent allowance in Rs.	:...........
           Medical allowance in Rs.	:...........           
           ---------------------------------------------------------------------------
           Gross/Total Salary in Rs.	:...........
           Income tax deduction in Rs.	:...........
           ---------------------------------------------------------------------------
           Net Salary  in Rs.		:...........                                */

import java.util.*;
class EmployeeSalary{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double da,hra;
final double  ma=2500;
System.out.println();
System.out.println("Begin Inserting Employee Details............");
System.out.print("Enter Employee Code		::");
String empCode=s.nextLine().toUpperCase();
//System.out.println(empCode);
System.out.print("Enter Employee Name		::");
String empName=s.nextLine().toUpperCase();
//System.out.println(empName);
System.out.print("Enter Post/Designation	::");
String empPost=s.nextLine().toUpperCase();
//System.out.println(empPost);
System.out.print("Enter Employee Basic Pay	::");
double empBasicPay=s.nextDouble();
//System.out.println(empBasicPay);
if(empBasicPay>10000)
da=empBasicPay*30/100;
else
da=empBasicPay*25/100;
if(empBasicPay<8000)
hra=empBasicPay*15/100;
else
hra=empBasicPay*20/100;
double gross=empBasicPay+da+hra+ma;
double itax=gross*12/100;
double net=gross+itax;
System.out.println("=====Employee Salary Details===dated:"+new Date());
System.out.println("Employee Code		:"+empCode);
System.out.println("Employee Name		:"+empName);
System.out.println("Post/Designation		:"+empPost);
System.out.println("Basic pay in Rs.		:"+empBasicPay);
System.out.println("Dearness allowance in Rs.	:"+da);
System.out.println("House rent allowance in Rs.	:"+hra);
System.out.println("Medical allowance in Rs.	:"+ma);
System.out.println("--------------------------------------------------------");
System.out.println("Gross Salary in Rs.		:"+gross);
System.out.println("Income tax deduction in Rs.	:"+itax);
System.out.println("--------------------------------------------------------");
System.out.println("Net Salary in Rs.		:"+net);
System.out.println("==========================================");
}//Close of main
}//Close of class

//OUTPUT
Begin Inserting Employee Details............
Enter Employee Code	::E001
Enter Employee Name	::ABHIJEET KUMAR
Enter Post/Designation	::EXECUTIVE
Enter Employee Basic Pay	::35000.0
=====Employee Salary Details===dated:Mon Jan 11 19:03:24 IST 2016
Employee Code		:E001
Employee Name		:ABHIJEET KUMAR
Post/Designation		:EXECUTIVE
Basic pay in Rs.		:35000.0
Dearness allowance in Rs.	:10500.0
House rent allowance in Rs.	:7000.0
Medical allowance in Rs.	:2500.0
--------------------------------------------------------
Gross Salary in Rs.		:55000.0
Income tax deduction in Rs.	:6600.0
--------------------------------------------------------
Net Salary in Rs.		:61600.0
==========================================

Begin Inserting Employee Details............
Enter Employee Code	::E002
Enter Employee Name	::RAJAN PAL
Enter Post/Designation	::CLERK
Enter Employee Basic Pay	::20000.0
=====Employee Salary Details===dated:Mon Jan 11 19:03:37 IST 2016
Employee Code		:E002
Employee Name		:RAJAN PAL
Post/Designation		:CLERK
Basic pay in Rs.		:20000.0
Dearness allowance in Rs.	:6000.0
House rent allowance in Rs.	:4000.0
Medical allowance in Rs.	:2500.0
--------------------------------------------------------
Gross Salary in Rs.		:32500.0
Income tax deduction in Rs.	:3900.0
--------------------------------------------------------
Net Salary in Rs.		:36400.0
==========================================
