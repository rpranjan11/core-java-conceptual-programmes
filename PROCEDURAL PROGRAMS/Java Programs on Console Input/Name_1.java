/* 3.WJA to accept user first name and last name, concatenate them and display the full name */

import java.util.Scanner;
class Name_1{
public static void main(String args[]){
Scanner C=new Scanner (System.in);
System.out.print("Enter user first name:");
String first=new String(C.nextLine());
System.out.print("Enter user last name:");
String last=new String(C.nextLine());
String fullName=new String(first.toString()+" "+last.toString());
System.out.print("\nFull Name:"+fullName.toString());
}// Close of main
}// Close of class