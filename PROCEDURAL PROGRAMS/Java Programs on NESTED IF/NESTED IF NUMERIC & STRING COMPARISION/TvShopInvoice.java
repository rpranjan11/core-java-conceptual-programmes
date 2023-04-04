/*2.Write a java application to create application software for a Tv shop offering puja discount on purchase of tv as per the chart given below:-
	TV TYPE   ------------   Discount on M.R.P.
	    LCD                                   30%
                                                     [Size(in inches)]
                                                    24"                 32"
                     LED                        15%                20%
Calculate and print the bill in the following fashion as 1% vat is to be paid by customer on getting bill:-
	=======Bill/Invoice Details====dated:.....
	Tv type			:...........
optional--	Size in inches		:...........
	M.R.P. in Rs.		:...........
	Discount rate in percentage	:........%
	Discount amount in Rs.	:...........
	--------------------------------------------------------
	Payable amount in Rs.	:...........
	1% VAT in Rs.		:...........
	--------------------------------------------------------
	Net bill amount in Rs.	: ...........
	========================================                   */

import java.util.*;
class TvShopInvoice{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double mrp,dist,pamt,vat,net,rate;
mrp=dist=pamt=vat=net=rate=0.0;
int size=0;
boolean check=true;
System.out.println();
System.out.print("Enter Tv type as LCD/LED	::");
String type=s.nextLine().toUpperCase();
//System.out.println(type);
if(type.equals("LCD"))
rate=30.0;
else if(type.equals("LED")){
System.out.print("Enter size of tv as 24\"/32\"	::");
size=s.nextInt();
//System.out.println(size);
if(size==24)
rate=15.0;
else if(size==32)
rate=20.0;
else{
check=false;
System.out.println("Wrong size of Tv entered,try again !");}
}else{
check=false;
System.out.println("Invalid Tv type found,try again !");}
if(check){
System.out.print("Enter M.R.P. of tv		::");
mrp=s.nextDouble();
//System.out.println(mrp);
if(mrp>0){
dist=mrp*rate/100;
pamt=mrp-dist;
vat=pamt*1/100;
net=pamt+vat;
System.out.println("=======Bill/Invoice Details====dated:"+new Date());
System.out.println("Tv type			:"+type);
if(type.equals("LED"))
System.out.println("Size of tv			:"+size);
System.out.println("M.R.P. of Tv in Rs.		:"+mrp);
System.out.println("Discount in percentage	:"+rate+"%");
System.out.println("Discount amount in Rs.	:"+dist);
System.out.println("------------------------------------------------------");
System.out.println("Payable amount in Rs.	:"+pamt);
System.out.println("1% VAT in Rs.		:"+vat);
System.out.println("------------------------------------------------------");
System.out.println("Net Bill amount in Rs.	:"+net);
System.out.println("==========================================");
}//Close of if(mrp>0)
else
System.out.println("M.R.P. of Tv entered is wrong,try again !");
}//Close of if(check)
}//Close of main
}//Close of class

//OUTPUT
Enter Tv type as LCD/LED	::LCD
Enter M.R.P. of tv		::35000.0
=======Bill/Invoice Details====dated:Fri Jan 15 12:15:18 IST 2016
Tv type			:LCD
M.R.P. of Tv in Rs.		:35000.0
Discount in percentage	:30.0%
Discount amount in Rs.	:10500.0
------------------------------------------------------
Payable amount in Rs.	:24500.0
1% VAT in Rs.		:245.0
------------------------------------------------------
Net Bill amount in Rs.	:24745.0
==========================================

Enter Tv type as LCD/LED	::LED
Enter size of tv as 24"/32"	::24
Enter M.R.P. of tv		::55000.0
=======Bill/Invoice Details====dated:Fri Jan 15 12:15:32 IST 2016
Tv type			:LED
Size of tv			:24
M.R.P. of Tv in Rs.		:55000.0
Discount in percentage	:15.0%
Discount amount in Rs.	:8250.0
------------------------------------------------------
Payable amount in Rs.	:46750.0
1% VAT in Rs.		:467.5
------------------------------------------------------
Net Bill amount in Rs.	:47217.5
==========================================
