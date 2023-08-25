/*1.Write a java application to accept mnth no., check and display the corresponding month name.   */

import java.util.Scanner;
class CheckMonth{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter month no. ::");
int month=s.nextInt();
//System.out.println(month);
switch(month){
case 1:System.out.println("January");
break;
case 2:System.out.println("February");
break;
case 3:System.out.println("March");
break;
case 4:System.out.println("April");
break;
case 5:System.out.println("May");
break;
case 6:System.out.println("June");
break;
case 7:System.out.println("July");
break;
case 8:System.out.println("August");
break;
case 9:System.out.println("September");
break;
case 10:System.out.println("October");
break;
case 11:System.out.println("November");
break;
case 12:System.out.println("December");
break;
default:System.out.println("Invalid month no. entered, try again!");
}//Close of Switch
}//Close of main
}//Close of class

//OUTPUT
Enter month no. ::5
May

Enter month no. ::11
November

Enter month no. ::1
January
