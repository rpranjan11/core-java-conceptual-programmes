/*4.Write a java application to accept four numbers, check and display the highest of the given four numbers. */

import java.util.Scanner;
class HighestOf4No{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter four numbers ::");
int a=s.nextInt();
//System.out.println(a);
int b=s.nextInt();
//System.out.println(b);
int c=s.nextInt();
//System.out.println(c);
int d=s.nextInt();
//System.out.println(d);
if(a>b)
  if(a>c)
    if(a>d)
     System.out.println("Highest number="+a);
    else
     System.out.println("Highest number="+d);
  else if(c>d)
   System.out.println("Highest number="+c);
 else
   System.out.println("Highest number="+d);
else
  if(b>c)
    if(b>d)
     System.out.println("Highest number="+b);
    else 
     System.out.println("Highest number="+d);
  else 
    if(c>d)
     System.out.println("Highest number="+c);
    else 
     System.out.println("Highest number="+d);
System.out.println("=====================");
}//Close of main
}//Close of class

//OUTPUT
Enter four numbers ::69
99
79
89
Highest number=99
=====================

Enter four numbers ::154555
151555
548545
158585
Highest number=548545
=====================
