/*1.Write a java application to check and display message whether the given number is perfect or not. */

import java.util.Scanner;
class CheckPerfectNo{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int d=1,sum=0;
while(d<=num/2){
if(num%d==0)
sum +=d;
d++;
}//Close of while
if(sum==num)
System.out.println(num+" is a perfect no.");
else
System.out.println(num+" is not a perfect no.");
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::10
10 is not a perfect no.

Enter a number ::28
28 is a perfect no.
