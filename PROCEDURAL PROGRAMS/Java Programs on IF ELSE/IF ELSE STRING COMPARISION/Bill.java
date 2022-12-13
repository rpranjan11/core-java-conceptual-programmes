/*4.Write a java application to compute and print the bill/invoice of the MALL by applying the condition given below:-
#.Accept/Read/Scan:- item code, item name, item type, company name, m.r.p. and quantity taken.
#.25% discount is available on item/product type Footwear otherwise 10% discount available on all other types (like Food, Garments, Stationary, etc.)
#.If payable amount exceeds Rs. 1000/- an additional discount of 5% of the payable amount is given as discount.
#.1% VAT is to be paid by consumer on getting bill.
          =======Bill/Invoice details====dated:..................
          Item Code			:.........
          Item Name			:.........
          Item Type			:.........
          Company Name		:.........
          M.R.P in Rs.			:.........
          Quantity taken			:.........
          -----------------------------------------------------------------------
          Total amount in Rs.		:.........
          Discount rate in percentage	:....%
          Discount amount in Rs.		:.........
          -----------------------------------------------------------------------
          Payable amount in Rs.		:.........
          1% VAT in Rs.			:.........
          -----------------------------------------------------------------------
          Net Bill/Invoicing amount in Rs.	:.........
       ==============================================                     */

import java.util.*;
class Bill{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double rate=10.0,nRate=0.0;
System.out.println();
System.out.print("Enter Item Code			::");
String itemCode=s.nextLine().toUpperCase();
//System.out.println(itemCode);
System.out.print("Enter Item Name			::");
String itemName=s.nextLine().toUpperCase();
//System.out.println(itemName);
System.out.print("Enter Item Type as Footwear, Food,....	::");
String  type=s.nextLine().toUpperCase();
//System.out.println(type);
System.out.print("Enter Company Name			::");
String cName=s.nextLine().toUpperCase();
//System.out.println(cName);
System.out.print("Enter M.R.P. in Rs.			::");
double mrp=s.nextDouble();
//System.out.println(mrp);
System.out.print("Enter Quantity taken			::");
int quantity=s.nextInt();
//System.out.println(quantity);
double total=mrp*quantity;
if(type.equals("FOOTWEAR"))
rate=25.0;
double dist=total*rate/100;
double gross=total-dist;
if(gross>1000)
nRate=5.0;
double nGross=gross-gross*nRate/100;
double vat=nGross*1/100;
double netBill=nGross+vat;
System.out.println("=======Bill/Invoice details====dated:"+new Date());
System.out.println("Item Code				:"+itemCode);
System.out.println("Item Name			:"+itemName);
System.out.println("Item Type				:"+type);
System.out.println("Company Name			:"+cName);
System.out.println("M.R.P. in Rs.			:"+mrp);
System.out.println("Quantity taken			:"+quantity);
System.out.println("-------------------------------------------------------------------------");
System.out.println("Total amount in Rs.			:"+total);
System.out.println("Discount in percentage		:"+rate+"%");
System.out.println("Discount in Rs.			:"+dist);
if(gross>1000){
System.out.println("Additional Discount in percentage	:"+nRate+"%");
System.out.println("Additional discount in Rs.		:"+gross*nRate/100);
}
System.out.println("-------------------------------------------------------------------------");
if(gross>1000)
System.out.println("Payable amount in Rs.		:"+nGross);
else
System.out.println("Payable Amount in Rs.		:"+gross);
System.out.println("1% vat in Rs.			:"+vat);
System.out.println("-------------------------------------------------------------------------");
System.out.println("Net Invoice amount in Rs.		:"+netBill);
System.out.println("================================================");
}//Close of main
}//Close of class

//OUTPUT
Enter Item Code			::I001
Enter Item Name			::SHIRT
Enter Item Type as Footwear, Food,....	::GARMENTS
Enter Company Name		::LEVI'S
Enter M.R.P. in Rs.			::1000.0
Enter Quantity taken			::1
=======Bill/Invoice details====dated:Mon Jan 11 23:19:30 IST 2016
Item Code				:I001
Item Name			:SHIRT
Item Type				:GARMENTS
Company Name			:LEVI'S
M.R.P. in Rs.			:1000.0
Quantity taken			:1
-------------------------------------------------------------------------
Total amount in Rs.			:1000.0
Discount in percentage		:10.0%
Discount in Rs.			:100.0
-------------------------------------------------------------------------
Payable Amount in Rs.		:900.0
1% vat in Rs.			:9.0
-------------------------------------------------------------------------
Net Invoice amount in Rs.		:909.0
================================================

Enter Item Code			::I002
Enter Item Name			::SHOE
Enter Item Type as Footwear, Food,....	::FOOTWEAR
Enter Company Name		::WOODLAND
Enter M.R.P. in Rs.			::3000.0
Enter Quantity taken			::1
=======Bill/Invoice details====dated:Mon Jan 11 23:20:47 IST 2016
Item Code				:I002
Item Name			:SHOE
Item Type				:FOOTWEAR
Company Name			:WOODLAND
M.R.P. in Rs.			:3000.0
Quantity taken			:1
-------------------------------------------------------------------------
Total amount in Rs.			:3000.0
Discount in percentage		:25.0%
Discount in Rs.			:750.0
Additional Discount in percentage	:5.0%
Additional discount in Rs.		:112.5
-------------------------------------------------------------------------
Payable amount in Rs.		:2137.5
1% vat in Rs.			:21.375
-------------------------------------------------------------------------
Net Invoice amount in Rs.		:2158.875
================================================
