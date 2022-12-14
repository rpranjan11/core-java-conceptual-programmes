/*2.Write a java application to accept surname of two clients, compare and display whether the surnames are same or not. */

import java.util.Scanner;
class CompareSurName{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter surname of 1st Client ::");
String surName1=s.nextLine().toUpperCase();
//System.out.println(surName1);
System.out.print("Enter surname of 2nd Client ::");
String surName2=s.nextLine().toUpperCase();
//System.out.println(surName2);
if(surName1.equals(surName2))
System.out.println("Surname found same.");
else
System.out.println("Surname not matched.");
}//Close of main
}//Close of class

//OUTPUT
Enter surname of 1st Client ::RANJAN
Enter surname of 2nd Client ::KUMAR
Surname not matched.

Enter surname of 1st Client ::SINGHANIA
Enter surname of 2nd Client ::SINGHANIA
Surname found same.
