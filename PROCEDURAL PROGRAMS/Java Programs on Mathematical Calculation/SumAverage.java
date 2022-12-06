/*1.WJA to accept two no.'s , calculate and display its sum and average value */

import java.util.Scanner;
class SumAverage{
public static void main(String args[]){
Scanner A=new Scanner(System.in);
System.out.print("Enter first No. :");
double num1=A.nextDouble();
System.out.print("Enter second No. :");
double num2=A.nextDouble();
double sum=num1+num2;
double avg=sum/2.0;
System.out.println("Sum of two no.'s="+sum);
System.out.println("Average of two no.'s="+avg);
}//Close of main
}//Close of class