/*5.Write a java application to print the sum of the series:-  
     x/1!+x^2/2!+x^3/3!+x^4/4!+..........upto n terms.  */

import java.util.Scanner;
class SumSeries_5{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int i=1;
double nr,dr=1,term=0,sum=0;
System.out.println();
System.out.print("Enter no. of terms for sum required ::");
int n=s.nextInt();
//System.out.println(n);
if(n>0){
System.out.print("Enter value for base ::");
int x=s.nextInt();
//System.out.println(x);
nr=x;
while(i<=n){
term=nr/dr;
sum=sum+term;
i++;
nr=nr*x;
dr=dr*i;
}//Close of while
System.out.println("Sum of "+n+" terms="+sum);
}//Close of if
else
System.out.println("Must enter a postive no., try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter no. of terms for sum required ::5
Enter value for base ::3
Sum of 5 terms=17.4
