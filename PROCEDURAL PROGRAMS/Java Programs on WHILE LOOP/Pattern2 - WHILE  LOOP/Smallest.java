/*4.Write a java application to accept n numbers, check and display the smallest value.*/

import java.util.Scanner;
class Smallest{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=0,n,num=0,small=0;
System.out.println();
System.out.print("How many number You want to enter? ::");
n=s.nextInt();
//System.out.println(n);
while(i<n){
System.out.print("Enter no:"+(i+1)+" ::");
num=s.nextInt();
//System.out.println(num);
if(i==0)
small=num;
else
if(num<small)
small=num;
i++;
}//Close of while
System.out.println("Smallest value in "+n+" No.'s="+small);
}//Close of main
}//Close of class

//OUTPUT
How many number You want to enter? ::3
Enter no:1 ::6
Enter no:2 ::3
Enter no:3 ::9
Smallest value in 3 No.'s=3
