/*7.Write a java application to accept item code, item name, company name, mrp and quantity taken. Calculate and print the Bill/Invoice in the given fashion as flat 30% discount is available on all product having product type "1" otherwise @ 20%. Further 1% VAT is to be paid by the consumer on getting bill.
          =======Bill/Invoice details====dated:..................
          Item Code			:.........
          Item Name			:.........
          Item Type			:.........
          Company Name		:.........
          M.R.P. in Rs.			:.........
          Quantity taken			:.........
          -----------------------------------------------------------------------
          Total amount in Rs.		:.........
          Discount amount in Rs.		:.........
          -----------------------------------------------------------------------
          Payable amount in Rs.		:.........
          1% VAT in Rs.			:.........
          -----------------------------------------------------------------------
          Net Bill/Invoicing amount in Rs.	:.........
       ============================================                     */

import java.util.*;
class Invoice{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double dist;
System.out.println();
System.out.print("Enter Item Code		::");
String itemCode=s.nextLine().toUpperCase();
//System.out.println(itemCode);
System.out.print("Enter Item Name		::");
String itemName=s.nextLine().toUpperCase();
//System.out.println(itemName);
System.out.print("Enter Item Type as 1/2/....	::");
int type=s.nextInt();
//System.out.println(type);
System.out.print("Enter Company Name		::");
s.nextLine();
String cName=s.nextLine().toUpperCase();
//System.out.println(cName);
System.out.print("Enter M.R.P. in Rs.		::");
double mrp=s.nextDouble();
//System.out.println(mrp);
System.out.print("Enter Quantity taken		::");
int quantity=s.nextInt();
//System.out.println(quantity);
double total=mrp*quantity;
if(type==1)
dist=total*30/100;
else
dist=total*20/100;
double gross=total-dist;
double vat=gross*1/100;
double netBill=gross+vat;
System.out.println("=======Bill/Invoice details====dated:"+new Date());
System.out.println("Item Code			:"+itemCode);
System.out.println("Item Name		:"+itemName);
System.out.println("Item Type			:"+type);
System.out.println("Company Name		:"+cName);
System.out.println("M.R.P. in Rs.		:"+mrp);
System.out.println("Quantity taken		:"+quantity);
System.out.println("--------------------------------------------------------");
System.out.println("Total amount in Rs.		:"+total);
System.out.println("Discount in Rs.		:"+dist);
System.out.println("--------------------------------------------------------");
System.out.println("Payable Amount in Rs.	:"+gross);
System.out.println("1% vat in Rs.		:"+vat);
System.out.println("--------------------------------------------------------");
System.out.println("Net Bill amount in Rs.	:"+netBill);
System.out.println("======================================");
}//Close of main
}//Close of class

//OUTPUT
Enter Item Code		::I001
Enter Item Name		::SHIRT
Enter Item Type as 1/2/....	::1
Enter Company Name	::J.HEMPSTEAD
Enter M.R.P. in Rs.		::2000.0
Enter Quantity taken		::1
=======Bill/Invoice details====dated:Mon Jan 11 19:43:40 IST 2016
Item Code			:I001
Item Name		:SHIRT
Item Type			:1
Company Name		:J.HEMPSTEAD
M.R.P. in Rs.		:2000.0
Quantity taken		:1
--------------------------------------------------------
Total amount in Rs.		:2000.0
Discount in Rs.		:600.0
--------------------------------------------------------
Payable Amount in Rs.	:1400.0
1% vat in Rs.		:14.0
--------------------------------------------------------
Net Bill amount in Rs.	:1414.0
======================================

Enter Item Code		::I002
Enter Item Name		::LED TV
Enter Item Type as 1/2/....	::2
Enter Company Name	::SONY BRAVIA
Enter M.R.P. in Rs.		::30000.0
Enter Quantity taken		::1
=======Bill/Invoice details====dated:Mon Jan 11 19:46:01 IST 2016
Item Code			:I002
Item Name		:LED TV
Item Type			:2
Company Name		:SONY BRAVIA
M.R.P. in Rs.		:30000.0
Quantity taken		:1
--------------------------------------------------------
Total amount in Rs.		:30000.0
Discount in Rs.		:6000.0
--------------------------------------------------------
Payable Amount in Rs.	:24000.0
1% vat in Rs.		:240.0
--------------------------------------------------------
Net Bill amount in Rs.	:24240.0
======================================
