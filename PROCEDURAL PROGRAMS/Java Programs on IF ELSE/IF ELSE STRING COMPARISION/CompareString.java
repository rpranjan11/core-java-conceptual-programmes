/*1.Write a java application to accept two strings. Compare and display message whether the strings are same or not. */

import java.util.Scanner;
class CompareString{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter 1st String ::");
String str1=s.nextLine().toUpperCase();
//System.out.println(str1);
System.out.print("Enter 2nd String ::");
String str2=s.nextLine().toUpperCase();
//System.out.println(str2);
System.out.println("Compairing Strings with boolean equals......");
if (str1.equals(str2))
System.out.println("String are same");
else
System.out.println("String are not same");
}//Close of main
}//Close of class

//OUTPUT
Enter 1st String ::WELCOME IN JAVA
Enter 2nd String ::WELCOME IN JAVA
Compairing Strings with boolean equals......
String are same
