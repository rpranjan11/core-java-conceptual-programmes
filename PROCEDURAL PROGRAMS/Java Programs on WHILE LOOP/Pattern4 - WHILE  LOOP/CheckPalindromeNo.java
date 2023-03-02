/*3.Write a java application to accept a number, check and display whether the given number is palindrome or not. */

import java.util.Scanner;
class CheckPalindromeNo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter a number ::");
int num=s.nextInt();
//System.out.println(num);
int tnum=num,d,rev=0;
while(tnum>0){
d=tnum%10;
rev=rev*10+d;
tnum=tnum/10;
}//Close of while
if(rev==num)
System.out.println(num+" is palindrome.");
else
System.out.println(num+" is not palindrome.");
}//Close of main
}//Close of class

//OUTPUT
Enter a number ::155
155 is not palindrome.

Enter a number ::121
121 is palindrome.
