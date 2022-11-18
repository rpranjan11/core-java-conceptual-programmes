/*4.Write a java application to accept two integer number, check and display the highest value.  */

import java.util.Scanner;
class HighestValue{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter 1st number ::");
int num1=s.nextInt();
//System.out.println(num1);
System.out.print("Enter 2nd number ::");
int num2=s.nextInt();
//System.out.println(num2);
if(num1>num2)
System.out.println("Given number "+num1+" is greater than "+num2+".");
else 
System.out.println("Given number "+num2+" is greater than "+num1+".");
}//Close of main
}//Close of class

//OUTPUT
Enter 1st number ::10
Enter 2nd number ::11
Given number 11 is greater than 10.

Enter 1st number ::22
Enter 2nd number ::21
Given number 22 is greater than 21.
