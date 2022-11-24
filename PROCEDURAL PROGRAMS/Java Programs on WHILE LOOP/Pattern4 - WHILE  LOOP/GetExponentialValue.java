/*5.Write a java application to accept  base and corresponding value of a number to calculate and print its exponential value. */

import java.util.Scanner;
class GetExponentialValue{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter value for base ::");
int b=s.nextInt();
//System.out.println(b);
System.out.print("Enter corresponding power ::");
int p=s.nextInt();
//System.out.println(p);
int exp,i;
exp=i=1;
while(i<=p){
exp=exp*p;
i++;
}//Close of while
System.out.println("Exponential value of "+b+"^"+p+"="+exp);
}//Close of main
}//Close of class

//OUTPUT
Enter value for base ::2
Enter corresponding power ::3
Exponential value of 2^3=27

Enter value for base ::4
Enter corresponding power ::5
Exponential value of 4^5=3125
