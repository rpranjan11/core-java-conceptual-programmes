/*2.Write a java application to accept an integer number, check and display message whether the given number is even or odd no. */

import java.util.Scanner;
class CheckEvenOdd{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter an integer number ::");
int num=s.nextInt();
//System.out.println(num);
String c="Odd";
if(num%2==0)
c="even";
System.out.println("Given no. "+num+" is an "+c+" number.");
}//Close of main
}//Close of class

//OUTPUT
Enter an integer number ::21
Given no. 21 is an Odd number.

Enter an integer number ::10
Given no. 10 is an even number.

Enter an integer number ::11
Given no. 11 is an Odd number.
