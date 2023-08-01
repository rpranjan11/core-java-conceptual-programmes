/*5.Write a java application to accept two integer number, check and display the smallest value.  */

import java.util.Scanner;
class SmallestValue{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter 1st number ::");
int num1=s.nextInt();
//System.out.println(num1);
System.out.print("Enter 2nd number ::");
int num2=s.nextInt();
//System.out.println(num2);
if(num1<num2)
System.out.println("Given number "+num1+" is smaller than "+num2+".");
else 
System.out.println("Given number "+num2+" is smaller than "+num1+".");
}//Close of main
}//Close of class

//OUTPUT
Enter 1st number ::11
Enter 2nd number ::21
Given number 11 is smaller than 21.

Enter 1st number ::55
Enter 2nd number ::49
Given number 49 is smaller than 55.
