/*1.Write a java application to accept n numbers,claculate and print the sum and average of number keyed in.                                                                  */

import java.util.Scanner;
class SumAvg{
public static void main(String args[]){
Scanner s =new Scanner(System.in);
int i=1,n;
double sum=0.0,num=0.0,avg;
System.out.println();
System.out.print("How many no. You want to enter? ::");
n=s.nextInt();
//System.out.println(n);
while(i<=n){
System.out.print("Enter no:"+i+" ::");
num=s.nextDouble();
//System.out.println(num);
sum+=num;
i++;
}//Close of while
avg=sum/n;
System.out.println("Sum of "+n+ "No.'s="+sum);
System.out.println("Average of "+n+"No.'s="+avg);
}//Close of main
}//Close of class

//OUTPUT
How many no. You want to enter? ::3
Enter no:1 ::10.0
Enter no:2 ::20.0
Enter no:3 ::30.0
Sum of 3No.'s=60.0
Average of 3No.'s=20.0
