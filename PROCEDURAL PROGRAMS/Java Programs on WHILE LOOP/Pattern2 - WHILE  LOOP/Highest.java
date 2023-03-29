/*3.Write a java application to accept n numbers, check and display the highest value.*/

import java.util.Scanner;
class Highest{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=0,n,num=0,high=0;
System.out.println();
System.out.print("How many number You want to enter? ::");
n=s.nextInt();
//System.out.println(n);
while(i<n){
System.out.print("Enter no:"+(i+1)+" ::");
num=s.nextInt();
//System.out.println(num);
if(i==0)
high=num;
else
if(num>high)
high=num;
i++;
}//Close of while
System.out.println("Highest value in "+n+" nos="+high);
}//Close of main
}//Close of class

//OUTPUT
How many number You want to enter? ::5
Enter no:1 ::2
Enter no:2 ::4
Enter no:3 ::8
Enter no:4 ::10
Enter no:5 ::6
Highest value in 5 nos=10
