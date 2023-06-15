/*6.Write a java application to accept a number ,calculate and display fabonacci series upto that given number. */

import java.util.Scanner;
class PrintFibonacciSeries{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter no. of terms to print fibonacci ::");
int num=s.nextInt();
//System.out.println(num);
int tail=0,head=1,nterm=0,i=1;
while(i<=num){
System.out.print(nterm+"   ");
tail=head;
head=nterm;
nterm=tail+head;
i++;
}//Close of while
}//Close of main
}//Close of class

//OUTPUT
Enter no. of terms to print fibonacci ::5
0   1   1   2   3   
Enter no. of terms to print fibonacci ::10
0   1   1   2   3   5   8   13   21   34   
Enter no. of terms to print fibonacci ::15
0   1   1   2   3   5   8   13   21   34   55   89   144   233   377   