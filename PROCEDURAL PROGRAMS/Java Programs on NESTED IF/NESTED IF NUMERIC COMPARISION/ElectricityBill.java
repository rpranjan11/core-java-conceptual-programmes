/*6.Write a java application software to calculate and print electricity bill of the consumer as per the chart given below:-
             UNIT          =============        RATE PER UNIT
             0-100                                                    6.0
            101-200                                                 5.50
            201-above                                             5.0
Apart from this a fixed meter rental charge Rs.200/- is to be paid by consumer per month.
	=======Electricity Bill====dated:..........
	Meter No.			:.........
	Unit Consumed		:.........
	Rate per Unit		:.........
	-------------------------------------------------------
	Bill amount in Rs.		:.........
	Meter rental charge in Rs.	:.........
	-------------------------------------------------------
	Net Bill amount in Rs.	:.........                                     */

import java.util.*;
class ElectricityBill{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double unit,rate,billAmt,net;
unit=rate=billAmt=net=0.0;
final double rental=200.0;
boolean flag=true;
System.out.println();
System.out.print("Enter meter no. 	::");
long mno=s.nextLong();
//System.out.println(mno);
if(mno>0){
System.out.print("Enter unit consumed 	::");
unit=s.nextDouble();
//System.out.println(unit);
if(unit>=0)
  if(unit<=100)
    rate=6.0;
  else 
    if(unit<=200)
      rate=5.50;
      else
      rate=5.0;
else{ 
flag=false;
System.out.println("Invalid unit entered,try again!");}
}else{
flag=false;
System.out.println("Invalid Meter No. entered,try again!");}
if(flag){
billAmt=unit*rate;
net=billAmt+rental;
System.out.println("=======Electricity Bill====dated:"+new Date());
System.out.println("Meter no.			:"+mno);
System.out.println("Unit consumed		:"+unit);
System.out.println("Rate per Unit		:"+rate);
System.out.println("---------------------------------------------------------");
System.out.println("Bill Amount is Rs.		:"+billAmt);
System.out.println("Meter rental charge in Rs.	:"+rental);
System.out.println("---------------------------------------------------------");
System.out.println("Net Bill Amount in Rs.	:"+net);
System.out.println("=============================================");
}//Close of if(flag)
}//Close of main
}//Close of class

//OUTPUT
Enter meter no. 	::1333551
Enter unit consumed 	::49.0
=======Electricity Bill====dated:Thu Jan 14 21:44:30 IST 2016
Meter no.			:1333551
Unit consumed		:49.0
Rate per Unit		:6.0
---------------------------------------------------------
Bill Amount is Rs.		:294.0
Meter rental charge in Rs.	:200.0
---------------------------------------------------------
Net Bill Amount in Rs.	:494.0
=============================================

Enter meter no. 	::1333552
Enter unit consumed 	::161.0
=======Electricity Bill====dated:Thu Jan 14 21:44:44 IST 2016
Meter no.			:1333552
Unit consumed		:161.0
Rate per Unit		:5.5
---------------------------------------------------------
Bill Amount is Rs.		:885.5
Meter rental charge in Rs.	:200.0
---------------------------------------------------------
Net Bill Amount in Rs.	:1085.5
=============================================

Enter meter no. 	::1333553
Enter unit consumed 	::350.0
=======Electricity Bill====dated:Thu Jan 14 21:45:09 IST 2016
Meter no.			:1333553
Unit consumed		:350.0
Rate per Unit		:5.0
---------------------------------------------------------
Bill Amount is Rs.		:1750.0
Meter rental charge in Rs.	:200.0
---------------------------------------------------------
Net Bill Amount in Rs.	:1950.0
=============================================
