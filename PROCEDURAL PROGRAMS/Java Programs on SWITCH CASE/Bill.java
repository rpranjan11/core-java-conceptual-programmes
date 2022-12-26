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
class Bill{
public static void main (String args[]){
Scanner s=new Scanner(System.in);
boolean check=true;
String pub="",type="";
double rate,dist,pamt,vat,net;
rate=dist=pamt=vat=net=0.0;
System.out.println();
System.out.print("Enter M.R.P. in Rs.		::");
double mrp=s.nextDouble();
//System.out.println(mrp);
if(mrp>0){
System.out.print("Enter Publisher of Books	::");
s.nextLine();
pub=s.nextLine().toUpperCase();
//System.out.println(pub);
if(pub.equals("BPB"))
rate=30.0;
else if(pub.equals("TMH")){
System.out.print("Enter Book Type as Fundamental/Web Design/Language ::");
type=s.nextLine().toUpperCase();
//System.out.println(type);
switch(type.charAt(0)){
case'F':
case'f':rate=15.0;
break;
case'W':
case'w':rate=20.0;
break;
case'L':
case'l':rate=25.0;
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
System.out.println("Publisher Name		:"+pub);
if(pub.equals("TMH"))
System.out.println("Book type			:"+type);
System.out.println("M.R.P. in Rs.		:"+mrp);
System.out.println("Discount rate in Percentage	:"+rate+"%");
System.out.println("Discount Amount in Rs.	:"+dist);
System.out.println("------------------------------------------------");
System.out.println("Payable Amount in Rs.	:"+pamt);
System.out.println("1% VAT Amount in Rs.	:"+vat);
System.out.println("------------------------------------------------");
System.out.println("Net Bill/Invoice Amount in Rs.	:"+net);
}//Close of if
}//Close of main
}//Close of class

//OUTPUT
Enter M.R.P. in Rs.		::1000.0
Enter Publisher of Books	::TMH
Enter Book Type as Fundamental/Web Design/Language ::LANGUAGE
= = = Bill/Invoice Details = = = Dated :Mon Jan 11 00:15:56 IST 2016
Publisher Name		:TMH
Book type			:LANGUAGE
M.R.P. in Rs.		:1000.0
Discount rate in Percentage	:25.0%
Discount Amount in Rs.	:250.0
------------------------------------------------
Payable Amount in Rs.	:750.0
1% VAT Amount in Rs.	:7.5
------------------------------------------------
Net Bill/Invoice Amount in Rs.	:757.5
