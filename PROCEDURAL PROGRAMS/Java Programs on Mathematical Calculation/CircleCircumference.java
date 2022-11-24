/*5.WJA to accept radius of a cicle. Calculate and print the Circumference of circle using formula [Circumference=2*pi*r]     */

import java.util.Scanner;
class CircleCircumference{
public static void main(String args[]){
Scanner E=new Scanner(System.in);
final double pi=22.0/7.0;
System.out.print("Enter radius of a circle :");
double rad=E.nextDouble();
double circumference=2*pi*rad;
System.out.println("Circumference of given Circle= "+circumference);
}//Close of main
}//Close of class