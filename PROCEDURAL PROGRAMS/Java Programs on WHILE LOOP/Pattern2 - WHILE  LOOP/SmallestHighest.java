/*5.Write a java application to accept n numbers, check and display the highest and the smallest number.*/

import java.util.Scanner;
class SmallestHighest{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i,n,num,high,small;
i=num=small=high=0;
System.out.println();
System.out.print("How many numbers You want to enter? ::");
n=s.nextInt();
//System.out.println(n);
while(i<n){
System.out.print("Enter no:"+(i+1)+" ::");
num=s.nextInt();
//System.out.println(num);
if(i==0){
high=num;
small=num;}
else if(num>high)
high=num;
else if(num<small)
small=num;
i++;
}//Close of while
System.out.println("Highest value is "+n+"No.'s="+high);
System.out.println("Smallest valut is "+n+"No.'s="+small);
}//Close of main
}//Close of class


//OUTPUT
How many numbers You want to enter? ::5
Enter no:1 ::5
Enter no:2 ::7
Enter no:3 ::1
Enter no:4 ::9
Enter no:5 ::3
Highest value is 5No.'s=9
Smallest valut is 5No.'s=1
