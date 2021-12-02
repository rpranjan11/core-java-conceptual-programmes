/*2.Write a java application to accept n numbers, calculate and print the product of n numbers.*/

import java.util.Scanner;
class Product{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,i=1;
double prod=1.0,num=0.0;
System.out.println();
System.out.print("How many No. You want to enter for product ? ::");
n=s.nextInt();
//System.out.println(n);
while(i<=n){
System.out.print("Enter no:"+i+" ::");
num=s.nextDouble();
//System.out.println(num);
prod=prod*num;
i++;
}//Close of while
System.out.println("Product of "+n+"No.'s="+prod);
}//Close of main
}//Close of class

//OUTPUT
How many No. You want to enter for product ? ::3
Enter no:1 ::5.0
Enter no:2 ::10.0
Enter no:3 ::2.0
Product of 3No.'s=100.0
