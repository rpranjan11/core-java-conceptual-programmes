/*1.Write a java application to accept voter age,check and display message whether he/she is eligible for voting or not on given criteria:-                                                                  [eligibility>=18].                 */

import java.util.Scanner;
class VoterEligibility{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter age of voter ::");
int age=s.nextInt();
//System.out.println(age);
String c="not ";
if(age>=18)
c="";
System.out.println("He/She is "+c+"eligible for voting.");
}//Close of main
}//Close of class

//OUTPUT
Enter age of voter ::17
He/She is not eligible for voting.

Enter age of voter ::18
He/She is eligible for voting.

Enter age of voter ::21
He/She is eligible for voting.
