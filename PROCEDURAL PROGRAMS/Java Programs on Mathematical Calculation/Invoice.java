/*10.WJA to accept Product Code, Product Name, Company Name, Product Type, Product M.R.P. and Quantity taken. Calculate and print the Bill/Invoice on purchase of Products/Goods in the following format as 30% discount availables on all products. Finally Customer/Consumer has to pay 1% VAT on bill payment.
                               = = = Bill/Invoice Details = = = Current Date&Time = = = 
                              Product/Item Code                         :.......
                              Product/Item Name                        :.......
                              Company Name                              :.......
                              Product/Item Type                          :.......
                              M.R.P. in Rs.                                    :.......
                              Quantity taken                                :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
                              Total Bill Amount in Rs.                 :.......
                              Discount Amount in Rs.                 :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
                              Payable Amount in Rs.                   :.......
                              1% VAT Amount in Rs.                    :.......
                              = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
                              Net Bill/Invoice Amount in Rs.        :.......                                                          */


import java.util.*;
class Invoice{
public static void main (String args[]){
Scanner J=new Scanner(System.in);
System.out.print("Enter Product/Item Code :");
String pcode=J.nextLine();
System.out.print("Enter Product/Item Name :");
String pname=J.nextLine();
System.out.print("Enter Company Name :");
String cname=J.nextLine();
System.out.print("Enter Product/Item Type :");
String ptype=J.nextLine();
System.out.print("Enter M.R.P. in Rs. :");
double mrp=J.nextDouble();
System.out.print("Enter No. of Quantity taken :");
int quantity=J.nextInt();
double billamt=mrp*quantity;
double discount=billamt*30/100;
double payamt=billamt-discount;
double vat=payamt*1/100;
double netamt=payamt+vat; 
System.out.println("= = = Bill/Invoice Details = = = Dated :"+new Date());
System.out.println("Product/Item Code :"+pcode.toUpperCase());
System.out.println("Product/Item Name :"+pname.toUpperCase());
System.out.println("Company Name :"+cname.toUpperCase());
System.out.println("Product/Item Type :"+ptype.toUpperCase());
System.out.println("M.R.P. in Rs. :"+mrp);
System.out.println("No. of Quantity taken :"+quantity);
System.out.println("= = = = = = = = = = = = = = = = = = =");
System.out.println("Total Bill Amount in Rs. :"+billamt);
System.out.println("Discount Amount in Rs. :"+discount);
System.out.println("= = = = = = = = = = = = = = = = = = =");
System.out.println("Payable Amount in Rs. :"+payamt);
System.out.println("1% VAT Amount in Rs. :"+vat);
System.out.println("= = = = = = = = = = = = = = = = = = =");
System.out.println("Net Bill/Invoice Amount in Rs. :"+netamt);
}//Close of main
}//Close of class
                              
                              