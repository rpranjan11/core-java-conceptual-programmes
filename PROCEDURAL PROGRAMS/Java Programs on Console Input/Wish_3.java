/* 2.WJA to accept patient name and wish hi/her wishes Get Well Soon<name>! */

import java.util.Scanner;
class Wish_3{
public static void main(String args[]){
Scanner B=new Scanner (System.in);
System.out.print("Enter Patient Name:");
String pname=B.nextLine();
String wishes=("Get Well Soon "+pname+"!");
System.out.println(wishes);
}// Close of main
}// Close of class