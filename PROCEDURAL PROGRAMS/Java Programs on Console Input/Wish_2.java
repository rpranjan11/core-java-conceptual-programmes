/* 2.WJA to accept patient name and wish hi/her wishes Get Well Soon<name>! */

import java.util.Scanner;
class Wish_2{
public static void main(String args[]){
Scanner B=new Scanner (System.in);
System.out.print("Enter Patient Name:");
String pname=new String(B.nextLine());
System.out.println("\nGet Well Soon "+pname.toString()+"!");
}// Close of main
}// Close of class