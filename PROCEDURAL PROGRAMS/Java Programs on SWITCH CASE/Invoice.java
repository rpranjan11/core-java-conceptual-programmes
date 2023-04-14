/*3.Write a java application to create an application software for a publisher      offering discount on purchase of books as per the chart given below:-
     Publisher   ------------    Discount in percentage on M.R.P.
        BPB        ------------                         30%
                                         Fundamental(1) --- Web Desiging(2) --- Language(3)
        TMH        ------------           15%                           20%                       30%
Calculate and print the Bill/Invoice  in the following format as 1% VAT is to be paid by the consumer on getting bill:-
                 = = = Bill/Invoice Details = = = Current Date&Time = = = 
                 Publisher Name		:.......
optional-  Book type as 1/2/3		:.......
                 M.R.P. in Rs.		:.......
                Discount rate in Percentage	:.......
                Discount Amount in Rs.	:.......
                ---------------------------------------------------------------------------------- 
                Payable Amount in Rs.	:.......
                1% VAT Amount in Rs.	:.......
                ----------------------------------------------------------------------------------
                Net Bill/Invoice Amount in Rs.	:.......                              */

import java.util.*;
class Invoice{
public static void main (String args[]){
Scanner s=new Scanner(System.in);
boolean check=true;
int type=0;
String pub="";
double rate,dist,pamt,vat,net;
rate=dist=pamt=vat=net=0.0;
System.out.println();
System.out.print("Enter M.R.P. in Rs. 		::");
double mrp=s.nextDouble();
//System.out.println(mrp);
if(mrp>0){
System.out.print("Enter Publisher of Books 	::");
s.nextLine();
pub=s.nextLine().toUpperCase();
//System.out.println(pub);
if(pub.equals("BPB"))
rate=30.0;
else if(pub.equals("TMH")){
System.out.print("Enter Book Type as 1/2/3 	::");
type=s.nextInt();
//System.out.println(type);
switch(type){
case 1:rate=15.0;
break;
case 2:rate=20.0;
break;
case 3:rate=25.0;
break;
default:check=false;
System.out.println("Wrong book type inputed, try again!");
}//Close of Switch
}else{
System.out.println("Publisher of Book entered is wrong, try again!");
check=false;
}
}else{
check=false;
System.out.println("M.R.P. entered is wrong, try again!");
}
if(check){
dist=mrp*rate/100;
pamt=mrp-dist;
vat=pamt*1/100;
net=pamt+vat;
System.out.println("= = = Bill/Invoice Details = = = Dated :"+new Date());
System.out.println("Publisher Name 		:"+pub);
if(pub.equals("TMH"))
System.out.println("Book type as 1/2/3 		:"+type);
System.out.println("M.R.P. in Rs. 		:"+mrp);
System.out.println("Discount rate in Percentage 	:"+rate+"%");
System.out.println("Discount Amount in Rs. 	:"+dist);
System.out.println("------------------------------------------------");
System.out.println("Payable Amount in Rs. 	:"+pamt);
System.out.println("1% VAT Amount in Rs. 	:"+vat);
System.out.println("------------------------------------------------");
System.out.println("Net Bill/Invoice Amount in Rs. 	:"+net);
System.out.println("=========================================");
}//Close of if
}//Close of main
}//Close of class

//OUTPUT 
Enter M.R.P. in Rs. 		::1000.0
Enter Publisher of Books 	::BPB
= = = Bill/Invoice Details = = = Dated :Mon Jan 11 00:23:11 IST 2016
Publisher Name 		:BPB
M.R.P. in Rs. 		:1000.0
Discount rate in Percentage 	:30.0%
Discount Amount in Rs. 	:300.0
------------------------------------------------
Payable Amount in Rs. 	:700.0
1% VAT Amount in Rs. 	:7.0
------------------------------------------------
Net Bill/Invoice Amount in Rs. 	:707.0
=========================================
Enter M.R.P. in Rs. 		::500.0
Enter Publisher of Books 	::TMH
Enter Book Type as 1/2/3 	::2
= = = Bill/Invoice Details = = = Dated :Mon Jan 11 00:24:36 IST 2016
Publisher Name 		:TMH
Book type as 1/2/3 		:2
M.R.P. in Rs. 		:500.0
Discount rate in Percentage 	:20.0%
Discount Amount in Rs. 	:100.0
------------------------------------------------
Payable Amount in Rs. 	:400.0
1% VAT Amount in Rs. 	:4.0
------------------------------------------------
Net Bill/Invoice Amount in Rs. 	:404.0
=========================================
