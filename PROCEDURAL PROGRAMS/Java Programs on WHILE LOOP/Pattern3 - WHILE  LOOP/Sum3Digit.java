/*5.Write a java application to accept a 3-digit number, calculate and print the sum of it's digits.*/

import java.util.Scanner;
class Sum3Digit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int dctr=0,digit,sum=0;
System.out.println();
System.out.print("Enter a 3-digit number ::");
int num=s.nextInt();
//System.out.println(num);
int cnum=num;
while(cnum>0){
cnum=cnum/10;
dctr++;
}//close of while
if(dctr==3){
cnum=num;
while(cnum>0){
digit=cnum%10;
sum=sum+digit;
cnum=cnum/10;
}//Close of while
System.out.println("Sum of digits of given number "+num+"="+sum);
}//Close of if
else
System.out.println("Must enter a 3-digit number,try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter a 3-digit number ::1234
Must enter a 3-digit number,try again!

Enter a 3-digit number ::258
Sum of digits of given number 258=15
