/*4.Write a java application to accept a number, calculate and display its factorial value. */

import java.util.Scanner;
class GetFactorialValue{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter  a number ::");
int num=s.nextInt();
//System.out.println(num);
int i,fact;
i=fact=1;
while(i<=num){
fact=fact*i;
i++;
}//Close of while
System.out.println(num +"!="+fact);
}//Close of main
}//Close of class

//OUTPUT
Enter  a number ::5
5!=120

Enter  a number ::10
10!=3628800
