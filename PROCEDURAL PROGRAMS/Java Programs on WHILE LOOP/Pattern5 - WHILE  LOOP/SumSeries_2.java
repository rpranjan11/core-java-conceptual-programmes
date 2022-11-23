/*2.Write a java application to print the sum of the series:-  
     1+x^2+x^4+x^6+..........upto n terms.  */

import java.util.Scanner;
class SumSeries_2{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
int i=1,term=1,sum=0;
System.out.println();
System.out.print("Enter no. of term for sum required ::");
int n=s.nextInt();
//System.out.println(n);
if(n>0){
System.out.print("Enter value for base ::");
int x=s.nextInt();
//System.out.println(x);
while(i<=n){
sum=sum+term;
i++;
term=term*x*x;
}//Close of while
System.out.println("Sum of "+n+" terms="+sum);
}//close of if
else
System.out.println("Must enter positive no, try again!");
}//Close of main
}//Close of class

//OUTPUT
Enter no. of term for sum required ::-5
Must enter positive no, try again!

Enter no. of term for sum required ::5
Enter value for base ::3
Sum of 5 terms=7381
