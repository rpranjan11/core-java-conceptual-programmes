/* 1.WJA to accept two string, concatenate them and display the same */

import java.util.Scanner;
class Concatenate_3{
public static void main(String args[]){
Scanner A=new Scanner (System.in);
System.out.print("Enter first string:");
String str1=A.nextLine();
System.out.print("Enter second string:");
String str2=A.nextLine();
String concat=str1+str2;
System.out.print("\nConcatenated String:"+concat);
}// Close of main
}// Close of class