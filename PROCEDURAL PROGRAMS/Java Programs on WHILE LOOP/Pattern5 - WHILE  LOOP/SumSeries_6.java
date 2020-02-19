/*6.Write a java application to print the sum of the series:-  
     1-x^2/2!+x^4/4!-x^6/6!+..........upto n terms.  */

import java.util.Scanner;
class SumSeries_6{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int i=1;
double nr=1,dr=1,term=0,sum=0;
System.out.println();
System.out.print("Enter no. of terms for  sum required ::");
int n=s.nextInt();
//System.out.println(n);
if(n>0){
System.out.print("Enter value for base ::");
int x=s.nextInt();
//System.out.println(x);
while(i<=n){
term=nr/dr;
if(i%2!=0)
sum=sum+term;
else
sum=sum-term;
nr=nr*x*x;
dr=dr*(2*i-1)*2*i;
i++;
}//close  of while
System.out.println("Sum of "+n+" terms="+sum);
}//Close of if
else
System.out.println("Must enter a positive no ., try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter no. of terms for  sum required ::-5
Must enter a positive no ., try again!

Enter no. of terms for  sum required ::10
Enter value for base ::3
Sum of 10 terms=-0.9899924980061545
