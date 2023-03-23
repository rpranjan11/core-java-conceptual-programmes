/* 4.WJA to accept first name, middle name and last name of user, concatenate them and display the full name */

import java.util.Scanner;
class FullName_1{
public static void main(String args[]){
Scanner D=new Scanner (System.in);
System.out.print("Enter user first name:");
String first=new String(D.nextLine());
System.out.print("Enter user middle name:");
String middle=new String(D.nextLine());
System.out.print("Enter user last name:");
String last=new String(D.nextLine());
String fullName=new String(first.toString()+" "+middle.toString()+" "+last.toString());
System.out.print("\nFull Name:"+fullName.toString());
}// Close of main
}// Close of class