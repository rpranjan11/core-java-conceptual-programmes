/*7.Write a java application to accept a 7-digit number, calculate and print the sum of digits of alternate number. */

import java.util.Scanner;
class SumAlternate7Digit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int d,rev,sum,count;
rev=sum=count=0;
System.out.println();
System.out.print("Enter a 7-digit number ::");
int num=s.nextInt();
//System.out.println(num);
int cnum=num;
while(cnum>0){
cnum=cnum/10;
count++;}
if(count==7){
cnum=num;
while(cnum>0){
d=cnum%10;
sum=sum+d;
cnum=cnum/100;
}Close of while
System.out.println("Sum of alternate digit of given No. "+num+"="+sum);
}Close of if
else
System.out.println("Must enter a 7-digit Number, try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter a 7-digit number ::45632187
Must enter a 7-digit Number, try again!

Enter a 7-digit number ::9874562
Sum of alternate digit of given No. 9874562=23
