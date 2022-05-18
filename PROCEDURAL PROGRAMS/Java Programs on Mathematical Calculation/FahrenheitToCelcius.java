/*6.WJA to accept temperature in fahrenheit. Convert the given temperature in equivalent Celcius using formula [C=5/9(F-32)]     */

import java.util.Scanner;
class FahrenheitToCelcius{
public static void main(String args[]){
Scanner F=new Scanner(System.in);
System.out.print("Enter temperature in Fahrenheit :");
double fah=F.nextDouble();
double cel=5.0/9.0*(fah-32);
System.out.println("Equivalent temperature in Celcius= "+cel);
}//Close of main
}//Close of class