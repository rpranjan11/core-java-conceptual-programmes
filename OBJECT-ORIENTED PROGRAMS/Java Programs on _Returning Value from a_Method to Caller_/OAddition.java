/*Java Application to demonstrate Returning Value from a Method to Caller */

import java.util.Scanner;
class Addition{
private double num1,num2;
void accept(double m,double n){
num1=m;
num2=n;
}
double sum(){
return(num1+num2);          //Returning Value to Caller
}
void print(){
System.out.println("Sum of two Nos. "+num1+"and"+num2+"="+sum());
}
}//Close of class Addition
class OAddition{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
Addition A=new Addition();
System.out.println();
System.out.print("Enter two Nos. ::");
double a=s.nextDouble();
double b=s.nextDouble();
//System.out.println(a);
//System.out.println(b);
A.accept(a,b);
//System.out.println("Sum of two Nos. ="+A.sum());
double add=A.sum();
System.out.println("Sum of two Nos. ="+add);
}//Close of main
}//Close of class OAddition

//OUTPUT
Enter two Nos. ::10.0
20.0
Sum of two Nos. =30.0
