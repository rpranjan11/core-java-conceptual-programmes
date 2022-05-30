/*2.WJA to two no.'s , calculate and display its product and difference value */

import java.util.Scanner;
class ProductDifference{
public static void main(String args[]){
Scanner B=new Scanner(System.in);
System.out.print("Enter first No. :");
double num1=B.nextDouble();
System.out.print("Enter second No. :");
double num2=B.nextDouble();
double prod=num1*num2;
double sub=num1-num2;
System.out.println("Product of two no.'s="+prod);
System.out.println("Difference of two no.'s="+sub);
}//Close of main
}//Close of class