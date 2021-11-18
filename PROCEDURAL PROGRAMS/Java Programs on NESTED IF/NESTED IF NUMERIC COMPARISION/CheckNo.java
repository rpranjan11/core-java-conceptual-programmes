/*1.Write a java application to accept an integer number, check and display the message whether the given number is positive/negative or neutral number. */

import java.util.Scanner;
class CheckNo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter an integer number ::");
int num=s.nextInt();
//System.out.println(num);
if(num>0)
System.out.println("Given no "+num+" is positive number.");
else if(num<0)
System.out.println("Given no "+num+" is negative number.");
else
System.out.println("Given no "+num+" is neutral number.");
System.out.println("=========================");
}//Close of main
}//Close of class

//OUTPUT
Enter an integer number ::-5
Given no -5 is negative number.
=========================

Enter an integer number ::14
Given no 14 is positive number.
=========================

Enter an integer number ::0
Given no 0 is neutral number.
=========================
