/*3.Write a java application to accept three numbers, check and display the lowest of the given three numbers. */

import java.util.Scanner;
class LowestOf3No{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter three numbers ::");
int a=s.nextInt();
System.out.println(a);
int b=s.nextInt();
System.out.println(b);
int c=s.nextInt();
System.out.println(c);
if(a<b)
 if(a<c)
  System.out.println("Lowest number="+a);
  else
  System.out.println("Lowest number="+c);
else 
 if(b<c)
   System.out.println("Lowest numbe=:"+b);
   else
   System.out.println("Lowest number="+c);
}//Close of main
}//Close of class

//OUTPUT
Enter three numbers ::45
65
21
Lowest number=21

Enter three numbers ::11
22
44
Lowest number=11
