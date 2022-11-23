/*1.Write a java application to accept a number, calculate and display the sum of digits. */

import java.util.Scanner;
class SumDigit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int sum=0,d;
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int cnum=num;
while(cnum>0){
d=cnum%10;
sum=sum+d;
cnum=cnum/10;
}//Close of while
System.out.println("Sum of digits of given no. "+num+"="+sum);
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::12345
Sum of digits of given no. 12345=15
