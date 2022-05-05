/*2.Write a java application to accept three numbers, check and display the highest of the given three numbers. */

import java.util.Scanner;
class HighestOf3No{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter three numbers ::");
int a=s.nextInt();
//System.out.println(a);
int b=s.nextInt();
//System.out.println(b);
int c=s.nextInt();
//System.out.println(c);
if(a>b)
 if(a>c)
  System.out.println("Highest number="+a);
  else
  System.out.println("Highest number="+c);
else 
 if(b>c)
   System.out.println("Highest number="+b);
   else
   System.out.println("Highest number="+c);
}//Close of main
}//Close of class

//OUTPUT
Enter three numbers ::45
99
66
Highest number=99

Enter three numbers ::101
25
100
Highest number=101
