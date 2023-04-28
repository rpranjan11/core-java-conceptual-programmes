/*4.Write a java application to accept a number and display the count the digits of number.*/

import java.util.Scanner;
class CountDigit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int count=0;
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int cnum=num;
while(cnum>0){
cnum=cnum/10;
count++;
}//Close of while
System.out.println("Count of digit of number "+num+"="+count);
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::45869
Count of digit of number 45869=5
