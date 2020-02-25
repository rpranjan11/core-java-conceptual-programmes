/*8.WJA to accept base and height of a right-angled triangle. Calculate and print the area of  given right-angled triangle using formula [area=1/2*base*height]   */

import java.util.Scanner;
class RightAngledTriangleArea{
public static void main(String args[]){
Scanner H=new Scanner(System.in);
System.out.print("Enter the base of right-angled triangle :");
double base=H.nextDouble();
System.out.print("Enter the height of right-angled triangle :");
double height=H.nextDouble();
double area=1/2.0*base*height;
System.out.println("Area of  given Right-angled triangle= "+area);
}//Close of main
}//Close of class