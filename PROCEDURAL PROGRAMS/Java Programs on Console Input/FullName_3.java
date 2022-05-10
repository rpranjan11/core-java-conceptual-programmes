/* 4.WJA to accept first name, middle name and last name of user, concatenate them and display the full name */

import java.util.Scanner;
class FullName_3{
public static void main(String args[]){
Scanner D=new Scanner (System.in);
System.out.print("Enter user first name:");
String first=D.nextLine();
System.out.print("Enter user middle name:");
String middle=D.nextLine();
System.out.print("Enter user last name:");
String last=D.nextLine();
String fullName=first+" "+middle+" "+last;
System.out.print("\nFull Name:"+fullName);
}// Close of main
}// Close of class