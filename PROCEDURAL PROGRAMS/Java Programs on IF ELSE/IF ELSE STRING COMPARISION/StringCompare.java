/*1.Write a java application to accept two strings. Compare and display message whether the strings are same or not. */

import java.util.Scanner;
class StringCompare{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter 1st String ::");
String str1=new String(s.nextLine());    //String str1=s.nextLine();
//System.out.println(str1);
System.out.print("Enter 2nd String ::");
String str2=new String(s.nextLine());    //String str2=s.nextLine();
//System.out.println(str2);
System.out.println("Compairing Strings with boolean equals......");
if (str1.equals(str2))
System.out.println("Strings are same");
else
System.out.println("Strings are not same");
System.out.println("Compairing Strings with boolean equalsIgnoreCase....");
if (str1.equalsIgnoreCase(str2))
System.out.println("Strings found same");
else
System.out.println("Strings found not same");
}//Close of main
}//Close of class

//OUTPUT
Enter 1st String ::hello java
Enter 2nd String ::HELLO JAVA
Compairing Strings with boolean equals......
Strings are not same
Compairing Strings with boolean equalsIgnoreCase....
Strings found same

Enter 1st String ::HELLO JAVA
Enter 2nd String ::HELLO JAVA
Compairing Strings with boolean equals......
Strings are same
Compairing Strings with boolean equalsIgnoreCase....
Strings found same
