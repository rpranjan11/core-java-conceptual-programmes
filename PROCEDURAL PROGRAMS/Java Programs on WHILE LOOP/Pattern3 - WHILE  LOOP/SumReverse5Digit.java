/*6.Write a java application to accept a 5-digit number, calculate and print its sum of digits along with its reverse. */

import java.util.Scanner;
class SumReverse5Digit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int d,rev,sum,count;
rev=sum=count=0;
System.out.println();
System.out.print("Enter a 5-digit number ::");
int num=s.nextInt();
//System.out.println(num);
int cnum=num;
while(cnum>0){
cnum=cnum/10;
count++;
}Close of while
if(count==5){
cnum=num;
while(cnum>0){
d=cnum%10;
sum=sum+d;
rev=rev*10+d;
cnum=cnum/10;
}Close of while
System.out.println("Sum of digits of the given No. "+num+"="+sum);
System.out.println("Reverse of digits of the given No. "+num+"="+rev);
}Close of if
else
System.out.println("Must enter a 5-digit Number, try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter a 5-digit number ::123654
Must enter a 5-digit Number, try again!

Enter a 5-digit number ::52143
Sum of digits of the given No. 52143=15
Reverse of digits of the given No. 52143=34125
