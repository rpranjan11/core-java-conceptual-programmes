/*7.Write a java application for a MALL offering discount on purchase of goods as per the chart given below:-
         Total Purchase Amount  ===========  Discount in Percentage
	1000-2000                                                        10%
	2001-5000                                                        15%
	5001-above                                                      20%
Read/Scan item/product code,item name ,item company name,m.r.p, quantity taken.
#further 1% vat is to be paid by the consumer an getting bil:-
	========Bill/Invoicing details====dated:..............
	Item Code:			:........
	Item Name:			:........
	Item Type:			:........
	Company Name:			:........
	M.R.P in Rs.:			:........
	Quantity taken:			:........
	---------------------------------------------------------------------
	Total amount in Rs.:			:........
	Discount in percentage:		:....%
	Discount amount in Rs.:		:........
	---------------------------------------------------------------------
	Payable amount in Rs.:		:........
	1% VAT in Rs.:			:........
	===========================================
	Net Bill/Invoice amount in Rs.:		:........ 		*/

import java.util.*;
class Invoice{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double total,rate,payable,discount,net,vat,mrp,quantity;
total=rate=payable=discount=net=vat=mrp=quantity=0.0;
String cName="",itemName="";
boolean flag=true;
System.out.println();
System.out.print("Enter Item Code		::");
int itemCode=s.nextInt();
//System.out.println(itemCode);
if(itemCode>0){
System.out.print("Enter Item Name		::");
s.nextLine();
itemName=s.nextLine().toUpperCase();
//System.out.println(itemName);
System.out.print("Enter Company Name		::");
cName=s.nextLine().toUpperCase();
//System.out.println(cName);
System.out.print("Enter M.R.P. of Item		::");
mrp=s.nextDouble();
//System.out.println(mrp);
if(mrp>0){
System.out.print("Enter Quantity taken		::");
quantity=s.nextInt();
//System.out.println(quantity);
if(quantity>0){
total=mrp*quantity;
if(total>=1000)
  if(total<=2000)
    rate=10.0;
  else 
    if(total<=5000)
      rate=15.0;
    else
      rate=20.0;
}else {
flag=false;
System.out.println("Invalid quantity entered, try again !");}
}else{
flag=false;
System.out.println("Wrong M.R.P. is entered, try again !");}
}else {flag=false;
System.out.println("Invalid Item Code is entered, try again !");}
if(flag){
discount=total*rate/100;
payable=total-discount;
vat=payable*1/100;
net=payable+vat;
System.out.println("======Bill/Invoicing details===dated:"+new Date());
System.out.println("Item Code				:"+itemCode);
System.out.println("Item Name			:"+itemName);
System.out.println("Company Name			:"+cName);
System.out.println("M.R.P. in Rs.			:"+mrp);
System.out.println("Quantity taken			:"+quantity);
System.out.println("-------------------------------------------------------");
System.out.println("Total amount in Rs.			:"+total);
System.out.println("Discount in percentage		:"+rate+"%");
System.out.println("Discount in Rs.			:"+discount);
System.out.println("-------------------------------------------------------");
System.out.println("Payable Amount in Rs.		:"+payable);
System.out.println("1% vat in Rs.			:"+vat);
System.out.println("--------------------------------------------------------");
System.out.println("Net Invoice amount in Rs.		:"+net);
System.out.println("===========================================");
}//Close of if(flag)
}//Close of main
}//Close of class

//OUTPUT
Enter Item Code		::1
Enter Item Name		::CANVAS SHOE
Enter Company Name	::SPARK
Enter M.R.P. of Item		::1500.0
Enter Quantity taken		::1.0
======Bill/Invoicing details===dated:Fri Jan 15 01:07:32 IST 2016
Item Code				:1
Item Name			:CANVAS SHOE
Company Name			:SPARK
M.R.P. in Rs.			:1500.0
Quantity taken			:1.0
-------------------------------------------------------
Total amount in Rs.			:1500.0
Discount in percentage		:10.0%
Discount in Rs.			:150.0
-------------------------------------------------------
Payable Amount in Rs.		:1350.0
1% vat in Rs.			:13.5
--------------------------------------------------------
Net Invoice amount in Rs.		:1363.5
===========================================
