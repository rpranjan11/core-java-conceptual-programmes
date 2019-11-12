/*3.Write a java application to print the sum of the series:-   
    1+1/x+1/x^2+1/x^3+1/x^4+..........upto n terms.  */

import java.util.Scanner;
class SumSeries_3{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int i=1;
double nr=1,dr=1,term=0,sum=0;
System.out.println();
System.out.print("Enter count of term for sum required ::");
int n=s.nextInt();
//System.out.println(n);
if(n>0){
System.out.print("Enter value for base ::");
int x=s.nextInt();
//System.out.println(x);
while(i<=n){
term=nr/dr;
sum=sum+term;
i++;
dr=dr*x;
}//Close of while
System.out.println("Sum of "+n+" terms ="+sum);
}
else
System.out.println("Must enter a positive no., try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter count of term for sum required ::10
Enter value for base ::5
Sum of 10 terms =1.249999872
