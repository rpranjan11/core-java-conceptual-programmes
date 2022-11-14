/*2.Write a java application to accept a number and display whether the given number is prime or not. */

import java.util.Scanner;
class CheckPrimeNo{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int d=2;
while(d<=num/2){
if(num%d==0)
d=num;
d++;
}//Close of while
if(d>num)
System.out.println(num+" is not prime number.");
else
System.out.println(num+" is a prime number.");
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::12
12 is not prime number.

Enter a number ::11
11 is a prime number.
