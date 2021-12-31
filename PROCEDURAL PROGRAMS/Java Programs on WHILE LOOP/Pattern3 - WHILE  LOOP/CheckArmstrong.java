/*8.Write a java application to accept an integer number to check and display message whether the given number is armstrong no. or not. */

import java.util.Scanner;
class CheckArmstrong{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int tnum=num;
int digit,sum=0;
while(tnum>0){
digit=tnum%10;
sum=sum+digit*digit*digit;
tnum=tnum/10;
}Close of while
if(sum==num)
System.out.println(num+" is a Armstrong number");
else
System.out.println(num+" is not a Armstrong number!");
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::125
125 is not a Armstrong number!

Enter a number ::153
153 is a Armstrong number
