/* 4.WJA to accept first name, middle name and last name of user, concatenate them and display the full name */

import java.util.Scanner;
class FullName_4{
public static void main(String args[]){
Scanner D=new Scanner (System.in);
System.out.print("Enter user first name:");
String first=D.nextLine();
System.out.print("Enter user middle name:");
String middle=D.nextLine();
System.out.print("Enter user last name:");
String last=D.nextLine();
System.out.print("\nFull Name:"+first+" "+middle+" "+last);
}// Close of main
}// Close of class