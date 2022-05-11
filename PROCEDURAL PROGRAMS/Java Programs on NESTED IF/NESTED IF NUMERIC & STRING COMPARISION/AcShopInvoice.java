/*3.Write a java application to create application software for an A/C shop offering OffSeason discount on purchase of A/C as per the chart given below:-
	AC type     -----------------     Discount on M.R.P.
	Window                                       15%
                                                            [Capacity(in ton)]
                                                               1                  2
                                                              20%             25%
Calculate and print the bill in the following fashion as 1% vat is to be paid by customer on getting bill.
	========Bill/Invoice Details====dated:.................
	AC type			::............
optional--	Capacity in tones		::............
	M.R.P. in Rs.		::............
	Discount rate in percentage	::.........%
	Discount amount in Rs.	::............
	------------------------------------------------------------
	Payable amount in Rs.	::............
	1%vat in Rs.		::............
	------------------------------------------------------------
	Net bill amount in Rs.	::............                                 */

import java.util.*;
class AcShopInvoice{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double mrp,dist,pamt,vat,net,rate;
mrp=dist=pamt=vat=net=rate=0.0;
int cpty=0;
boolean flag=true;
System.out.println();
System.out.print("Enter A/C type as Window/Split	::");
String type=s.nextLine().toUpperCase();
//System.out.println(type);
if(type.equals("WINDOW"))
rate=15.0;
else if(type.equals("SPLIT")){
System.out.print("Enter capacity in ton as 1/2	::");
cpty=s.nextInt();
//System.out.println(cpty);
if(cpty==1)
rate=20.0;
else if(cpty==2)
rate=25.0;
else{
flag=false;
System.out.println("Invalid capacity entered,try again !");}
}else{
flag=false;
System.out.println("Wrong A/C type entered,try again !");}
if(flag){
System.out.print("Enter M.R.P. of A/C		::");
mrp=s.nextDouble();
//System.out.println(mrp);
if(mrp>0){
dist=mrp*rate/100;
pamt=mrp-dist;
vat=pamt*1/100;
net=pamt+vat;
System.out.println("========Bill/Invoice Details====dated:"+new Date());
System.out.println("A/C type			:"+type);
if(type.equals("SPLIT"))
System.out.println("Capacity of A/C in ton	:"+cpty);
System.out.println("M.R.P. in Rs.		:"+mrp);
System.out.println("Discount in percentage	:"+rate+"%");
System.out.println("Discount amount in Rs.	:"+dist);
System.out.println("-----------------------------------------------------------");
System.out.println("Payable amount in Rs.	:"+pamt);
System.out.println("1% VAT in Rs.		:"+vat);
System.out.println("-----------------------------------------------------------");
System.out.println("Net Bill in Rs.		:"+net);
System.out.println("========================================");
}//Close of if(mrp>0)
else
System.out.println("M.R.P. entered is wrong,try again !");
}//Close of if(flag)
}//Close of main
}//Close of class

//OUTPUT
Enter A/C type as Window/Split	::SPLIT
Enter capacity in ton as 1/2	::1
Enter M.R.P. of A/C		::25000.0
========Bill/Invoice Details====dated:Fri Jan 15 13:00:01 IST 2016
A/C type			:SPLIT
Capacity of A/C in ton	:1
M.R.P. in Rs.		:25000.0
Discount in percentage	:20.0%
Discount amount in Rs.	:5000.0
-----------------------------------------------------------
Payable amount in Rs.	:20000.0
1% VAT in Rs.		:200.0
-----------------------------------------------------------
Net Bill in Rs.		:20200.0
========================================

Enter A/C type as Window/Split	::WINDOW
Enter M.R.P. of A/C		::18000.0
========Bill/Invoice Details====dated:Fri Jan 15 13:00:11 IST 2016
A/C type			:WINDOW
M.R.P. in Rs.		:18000.0
Discount in percentage	:15.0%
Discount amount in Rs.	:2700.0
-----------------------------------------------------------
Payable amount in Rs.	:15300.0
1% VAT in Rs.		:153.0
-----------------------------------------------------------
Net Bill in Rs.		:15453.0
========================================
