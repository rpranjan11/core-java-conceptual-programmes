/*2.Write a java application to accept a number, check and display whether the given number is prime or not.*/

import java.util.Scanner;
class CheckPrimeNo_2{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
String rem="";
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int d=2;
while(d<=num/2){
if(num%d==0){
d=num;
rem="not";
}//Close of if
d++;
}//Close of while
System.out.println(num+ " is "+rem+" a prime number.");
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::10
10 is not a prime number.

Enter a number ::5
5 is  a prime number.
