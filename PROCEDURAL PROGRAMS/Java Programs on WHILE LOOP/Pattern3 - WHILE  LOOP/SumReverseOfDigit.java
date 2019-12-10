/*3.Write a java application to accept a number, calculate and print the sum and reverse of  it's digits.*/

import java.util.Scanner;
class SumReverseOfDigit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int d=0,sum=0,rev=0;
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int cnum=num;
while(cnum>0){
d=cnum%10;
sum=sum+d;
rev=rev*10+d;
cnum=cnum/10;
}//Close of while
System.out.println("Sum of digits of given no "+num+"="+sum);
System.out.println("Reverse of digits of given no "+num+"="+rev);
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::4545652
Sum of digits of given no 4545652=31
Reverse of digits of given no 4545652=2565454
