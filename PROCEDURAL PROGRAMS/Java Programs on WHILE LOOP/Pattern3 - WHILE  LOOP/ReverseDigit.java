/*2.Write a java application to accept a number, calculate and print the reverse of number.*/

import java.util.Scanner;
class ReverseDigit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int rev=0,d;
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int cnum=num;
while(cnum>0){
d=cnum%10;
rev=rev*10+d;
cnum=cnum/10;
}//Close of while
System.out.println("Reverse of given no "+num+"="+rev);
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::5465255
Reverse of given no 5465255=5525645
