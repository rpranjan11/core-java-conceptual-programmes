/*1.Write a java application to accept company name, type and m.r.p of pen, check and display message to buy pen of company "Cello" whose price is more than Rs. 50/- and less than Rs. 100/- otherwise look for any other company whose type is ball pen. */

import java.util.Scanner;
class BuyPen{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter company name ::");
String compName=s.nextLine().toUpperCase();
//System.out.println(compName);
if(compName.equals("CELLO")){
System.out.print("Enter M.R.P. of pen ::");
double mrp=s.nextDouble();
//System.out.println(mrp);
  if(mrp<=50)
   System.out.println("Pen not  bought.");
  else 
     if(mrp>=100)
      System.out.println("Pen not bought.");
     else
      System.out.println("Pen bought.");
}else{
System.out.print("Enter type of pen ::");
String type=s.nextLine().toUpperCase();
//System.out.println(type);
   if(type.equals("BALL"))
    System.out.println("Pen bought.");
   else
    System.out.println("Pen not bought.");
}
System.out.println("==================");
}//Close of main
}//Close of class

//OUTPUT
Enter company name ::CELLO
Enter M.R.P. of pen ::25.0
Pen not  bought.
==================

Enter company name ::CELLO
Enter M.R.P. of pen ::51.0
Pen bought.
==================

Enter company name ::CELLO
Enter M.R.P. of pen ::100.0
Pen not bought.
==================

Enter company name ::LINC
Enter type of pen ::BALL
Pen bought.
==================

Enter company name ::PARKER
Enter type of pen ::FOUNTAIN
Pen not bought.
==================
