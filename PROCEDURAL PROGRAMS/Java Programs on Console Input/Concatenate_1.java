/* 1.WJA to accept two string, concatenate them and display the same */

import java.util.Scanner;
class Concatenate_1{
public static void main(String args[]){
Scanner A=new Scanner (System.in);
System.out.print("Enter first string:");
String str1=new String(A.nextLine());
System.out.print("Enter second string:");
String str2=new String(A.nextLine());
String concat=new String(str1.toString()+str2.toString());
System.out.print("\nConcatenated String:"+concat.toString());
}// Close of main
}// Close of class