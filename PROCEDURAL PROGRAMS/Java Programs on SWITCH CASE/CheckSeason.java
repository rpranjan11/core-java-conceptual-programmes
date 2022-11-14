/*2.Write a java application to accept mnth no., check and display the corresponding season name to which month belongs.
               Month No.      ------------------       Season Name
               11,12,1,2         ------------------       Winter Season
               3,4,5,6            -------------------       Summer Season
               7,8,9,10          -------------------       Rainy Season                   */

import java.util.Scanner;
class CheckSeason{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter month no. ::");
int month=s.nextInt();
//System.out.println(month);
switch(month)
{
case 11:
case 12:
case 1:
case 2:System.out.println("Winter Season");
break;
case 3:
case 4:
case 5:
case 6:System.out.println("Summer Season");
break;
case 7:
case 8:
case 9:
case 10:System.out.println("Rainy Season");
break;
default:System.out.println("Month no. entered is invalid, try again!");
}//Close of Switch
}//Close of main
}//Close of class

//OUTPUT
Enter month no. ::5
Summer Season

Enter month no. ::11
Winter Season

Enter month no. ::9
Rainy Season
