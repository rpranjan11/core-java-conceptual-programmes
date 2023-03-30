/*7.WJA to accept temperature in Celcius. Convert the given temperature in equivalent Fahrenheit using formula [F=9/5C+32]     */

import java.util.Scanner;
class CelciusToFahrenheit{
public static void main(String args[]){
Scanner G=new Scanner(System.in);
System.out.print("Enter temperature in Celcius :");
double cel=G.nextDouble();
double fah=9.0/5.0*cel+32;
System.out.println("Equivalent temperature in Fahrenheit= "+fah);
}//Close of main
}//Close of class