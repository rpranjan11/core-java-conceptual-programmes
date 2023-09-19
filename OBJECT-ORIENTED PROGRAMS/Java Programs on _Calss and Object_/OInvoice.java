/*2.Create a class named Billing/Invoicing that consists following members to generate and print bill.
#.define instance variables itemCode(string), itemName(string), companyName(string), tpye(string), qty(double) and mrp(double).
#.define constructors to automatic initialisation.
#.define methods to change input.
#.define methods to ccompute invoice/bill by applying th following conditions:-
*flat 40% discount is available on Garments on purchase amount and also 30% on Footwear and 10% on other products.
*1% VAT is to be paid by consumer on getting bill.
*define method to print invoice/bill.
Display the complete functionality
[Make suitable assumption if necessary]                                                      */

import java.util.*;
class Invoice{
private String itemCode="",itemName="",companyName="",productType="";
private double mrp,qty;
Invoice(){}
Invoice(String itemCode,String itemName,String companyName,String productType,double mrp,double qty){
this.itemCode=itemCode;
this.itemName=itemName;
this.companyName=companyName;
this.productType=productType;
this.mrp=mrp;
this.qty=qty;
}
void change(String itemCode,String itemName,String companyName,String productType,double mrp,double qty){
this.itemCode=itemCode;
this.itemName=itemName;
this.companyName=companyName;
this.productType=productType;
this.mrp=mrp;
this.qty=qty;
}
void change(double mrp,double qty){
this.mrp=mrp;
this.qty=qty;
}
double purchaseAmt(){
return(mrp * qty);
}
double getDiscountRate(){
double slab=10.0;
if(productType.equalsIgnoreCase("GARMENT"))
   slab=40.0;
else if(productType.equalsIgnoreCase("FOOTWEAR"));
           slab=30.0;
return(slab);
}
double getDiscountAmt(){
return(purchaseAmt() * getDiscountRate() / 100);
}
double getPayableAmt(){
return(purchaseAmt() - getDiscountAmt());
}
double getVAT(){
return(getPayableAmt() * 1/100);
}
double netBillAmt(){
return(getPayableAmt() + getVAT());
}
void print(){
System.out.println("=======Bill/Invoice details====dated:"+new Date());
System.out.println("Item Code			::"+itemCode.toUpperCase());
System.out.println("Item Name		::"+itemName.toUpperCase());
System.out.println("Company Name		::"+companyName.toUpperCase());
System.out.println("Item Type			::"+productType.toUpperCase());
System.out.println("M.R.P in Rs.		::"+mrp);
System.out.println("Quantity taken		::"+qty);
System.out.println("---------------------------------------------------------------");
System.out.println("Purchase Amount in Rs.	::"+purchaseAmt());
System.out.println("Discount Rate in Percentage	::"+getDiscountRate()+"%");
System.out.println("Discount Amount in Rs.	::"+getDiscountAmt());
System.out.println("---------------------------------------------------------------");
System.out.println("Payable Amount in Rs.	::"+getPayableAmt());
System.out.println("1% VAT in Rs.		::"+getVAT());
System.out.println("---------------------------------------------------------------");
System.out.println("Net Bill/Invoice Amount in Rs.	::"+netBillAmt());
System.out.println("====================================");
}
}//close of class Invoice
class OInvoice{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("Begin Inserting Purchase Item details.......");
System.out.print("Enter Item Code		:");
String itemCode=s.nextLine();
//System.out.println(itemCode);
System.out.print("Enter Item Name		:");
String itemName=s.nextLine();
//System.out.println(itemName);
System.out.print("Enter Company Name		:");
String companyName=s.nextLine();
//System.out.println(companyName);
System.out.print("Enter Item Type		:");
String productType=s.nextLine();
//System.out.println(productType);
System.out.print("Enter M.R.P. In Rs.		:");
double mrp=s.nextDouble();
//System.out.println(mrp);
System.out.print("Enter Quantity taken		:");
double qty=s.nextDouble();
//System.out.println(qty);
Invoice bill=new Invoice(itemCode,itemName,companyName,productType,mrp,qty);
bill.print();
System.out.print("Enter New M.R.P. In Rs.	:");
mrp=s.nextDouble();
//System.out.println(mrp);
System.out.print("Enter New Quantity taken	:");
qty=s.nextDouble();
//System.out.println(qty);
bill.change(mrp,qty);
bill.print();
}//close of main
}//close of OInvoice class

//OUTPUT
Begin Inserting Purchase Item details.......
Enter Item Code		:i001
Enter Item Name		:iphone
Enter Company Name	:apple
Enter Item Type		:electronics
Enter M.R.P. In Rs.		:60000.0
Enter Quantity taken		:1.0
=======Bill/Invoice details====dated:Sat Jan 09 00:06:56 IST 2016
Item Code			::I001
Item Name		::IPHONE
Company Name		::APPLE
Item Type			::ELECTRONICS
M.R.P in Rs.		::60000.0
Quantity taken		::1.0
---------------------------------------------------------------
Purchase Amount in Rs.	::60000.0
Discount Rate in Percentage	::30.0%
Discount Amount in Rs.	::18000.0
---------------------------------------------------------------
Payable Amount in Rs.	::42000.0
1% VAT in Rs.		::420.0
---------------------------------------------------------------
Net Bill/Invoice Amount in Rs.	::42420.0
====================================
Enter New M.R.P. In Rs.	:55000.0
Enter New Quantity taken	:2.0
=======Bill/Invoice details====dated:Sat Jan 09 00:07:00 IST 2016
Item Code			::I001
Item Name		::IPHONE
Company Name		::APPLE
Item Type			::ELECTRONICS
M.R.P in Rs.		::55000.0
Quantity taken		::2.0
---------------------------------------------------------------
Purchase Amount in Rs.	::110000.0
Discount Rate in Percentage	::30.0%
Discount Amount in Rs.	::33000.0
---------------------------------------------------------------
Payable Amount in Rs.	::77000.0
1% VAT in Rs.		::770.0
---------------------------------------------------------------
Net Bill/Invoice Amount in Rs.	::77770.0
====================================
