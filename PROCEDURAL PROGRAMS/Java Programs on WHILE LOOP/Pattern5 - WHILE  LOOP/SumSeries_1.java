/*1.Write a java application to print the sum of the series:-   
     1+x+x^2+x^3+x^4+..........upto n terms.  */

import java.util.Scanner;
class SumSeries_1{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int i=1,term=1,sum=0;
System.out.println();
System.out.print("Enter no. of terms for sum required ::");
int n=s.nextInt();
//System.out.println(n);
if(n>0){
System.out.print("Enter value for base ::");
int x=s.nextInt();
//System.out.println(x);
while(i<=n){
sum=sum+term;
i++;
term=term*x;
}//Close of while
System.out.println("sum of "+n+"term="+sum);
}//Close of if
else
System.out.println("Must enter a positive no, try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter no. of terms for sum required ::10
Enter value for base ::2
sum of 10term=1023
