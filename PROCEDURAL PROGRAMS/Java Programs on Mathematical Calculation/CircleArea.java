/*4.WJA to accept radius of a cicle. Calculate and print the area of circle using formula [area=pi*r*r]     */

import java.util.Scanner;
class CircleArea{
public static void main(String args[]){
Scanner D=new Scanner(System.in);
final double pi=22.0/7.0;
System.out.print("Enter radius of a circle :");
double rad=D.nextDouble();
double area=pi*rad*rad;
System.out.println("Area of given Circle= "+area);
}//Close of main
}//Close of class