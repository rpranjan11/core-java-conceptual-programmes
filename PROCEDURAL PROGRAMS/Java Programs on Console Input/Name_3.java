/* 3.WJA to accept user first name and last name, concatenate them and display the full name */

import java.util.Scanner;
class Name_3{
public static void main(String args[]){
Scanner C=new Scanner (System.in);
System.out.print("Enter user first name:");
String first=C.nextLine();
System.out.print("Enter user last name:");
String last=C.nextLine();
String fullName=first+" "+last;
System.out.print("\nFull Name:"+fullName);
}// Close of main
}// Close of class