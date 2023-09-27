/*5.Write a java application to accept five numbers, check and display the smallest of the given five numbers. */

import java.util.Scanner;
class LowestOf5No{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter five numbers ::");
int a=s.nextInt();
//System.out.println(a);
int b=s.nextInt();
//System.out.println(b);
int c=s.nextInt();
//System.out.println(c);
int d=s.nextInt();
//System.out.println(d);
int e=s.nextInt();
//System.out.println(e);

if(a<b)
  if(a<c)
    if(a<d)
      if(a<e)
       System.out.println("Smallest number="+a);
       else
       System.out.println("Smallest number="+e);
     else 
       if(d<e)
        System.out.println("Smallest number="+d);
        else
        System.out.println("Smallest number="+e);
  else 
    if(c<d)
      if(c<e)
       System.out.println("Smallest number="+c);
       else 
       System.out.println("Smallest number="+e);
    else
      if(d<e)
       System.out.println("Smallest number="+d);
       else 
       System.out.println("Smallest number="+e);
else 
  if(b<c)
    if(b<d)
      if(b<e)
       System.out.println("Smallest number="+b);
       else 
       System.out.println("Smallest number="+e);
    else
      if(d<e)
       System.out.println("Smallest number="+d);
       else 
       System.out.println("Smallest number="+e);
  else
    if(c<d)
      if(c<e)
       System.out.println("Smallest number="+c);
       else 
       System.out.println("Smallest number="+e);
    else
      if(d<e)
       System.out.println("Smallest number="+d);
       else 
       System.out.println("Smallest number="+e);
System.out.println("=====================");
}//Close of main
}//Close of class

//OUTPUT

Enter five numbers ::154
555
854
945
454
Smallest number=154
=====================

Enter five numbers ::16665
58585
15154
84889
59596
Smallest number=15154
=====================
