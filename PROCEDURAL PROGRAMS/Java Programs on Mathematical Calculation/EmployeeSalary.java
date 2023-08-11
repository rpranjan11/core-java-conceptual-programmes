/*9.WJA to accept Employee Code, Employee Name, Post/Designation and Basic Pay of the Employee. Calculate Dearness Allowance (i.e.DA) @30% of the Basic Pay. Similarly Calculate House Rent Allowance (i.e.HRA) @20% of the Basic Pay. Calculate and print the Employee Salary Details in the given format as Income Tax is to be deductected @12% of the Gross/Total Salary.
                               = = = Employee Salary Details = = = Current Date&Time = = = 
                              Employee Code                                 :.......
                              Employee Name                                :.......
                              Post/Designation                               :.......
                              Basic Pay in Rs.                                :.......
                              Dearness Allowance in Rs.               :.......
                              House Rent Allowance in Rs.           :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =
                              Gross/Total Salary in Rs.                  :.......
                              Income Tax Deduction in Rs.           :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  =
                              Net Salary in Rs.                               :.......                                                            */


import java.util.*;
class EmployeeSalary{
public static void main (String args[]){
Scanner I=new Scanner(System.in);
System.out.print("Enter Employee Code :");
String ecode=I.nextLine();
System.out.print("Enter Employee Name :");
String ename=I.nextLine();
System.out.print("Enter Employee Post/Designation :");
String post=I.nextLine();
System.out.print("Enter Basic Pay of the Employee :");
double basic=I.nextDouble();
double da=basic*30/100;
double hra=basic*20/100;
double gross=basic+da+hra;
double itax=gross*12/100;
double netsal=gross-itax;
System.out.println("= = = Employee Salary Details = = = Dated :"+new Date());
System.out.println("Employee Code :"+ecode.toUpperCase());
System.out.println("Employee Name :"+ename.toUpperCase());
System.out.println("Post/Designation :"+post.toUpperCase());
System.out.println("Basic Pay in Rs. :"+basic);
System.out.println("Dearness Allowance in Rs. :"+da);
System.out.println("House Rent Allowance in Rs. :"+hra);
System.out.println("= = = = = = = = = = = = = = = = = =");
System.out.println("Gross/Total Salary in Rs. :"+gross);
System.out.println("Income Tax Deduction in Rs. :"+itax);
System.out.println("= = = = = = = = = = = = = = = = = =");
System.out.println("Net Salary in Rs. :"+netsal);
}//Close of main
}//Close of class
                              
                              