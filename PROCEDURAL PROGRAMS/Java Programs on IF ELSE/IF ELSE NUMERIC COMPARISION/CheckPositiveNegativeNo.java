/*3.Write a java application to accept an integer number, check and display message whether the given number is positive or negative no.    */

import java.util.Scanner;
class CheckPositiveNegativeNo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter an integer no ::");
int num=s.nextInt();
//System.out.println(num);
String  c="negative";
if(num>=0)
c="positive";
System.out.println("Given number "+num+" is "+c+" number.");
}//Close of main
}//Close of class

//OUTPUT 
Enter an integer no ::5
Given number 5 is positive number.

Enter an integer no ::-3
Given number -3 is negative number.
