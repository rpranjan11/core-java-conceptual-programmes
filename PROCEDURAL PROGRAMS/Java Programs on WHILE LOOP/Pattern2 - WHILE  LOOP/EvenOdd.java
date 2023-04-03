/*6.Write a java application to accept n nos, check and display the total count of even and odd number. */

import java.util.Scanner;
class EvenOdd{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,i,num,ectr,octr;
i=ectr=octr=0;
System.out.println();
System.out.print("How many number You want to enter? ::");
n=s.nextInt();
//System.out.println(n);
while(i<n){
System.out.print("Enter no:"+(i+1)+" ::");
num=s.nextInt();
//System.out.println(num);
if(num%2==0)
ectr++;
else
octr++;
i++;
}//Close of while
System.out.println("Total count of even in  "+n+" No.'s="+ectr);
System.out.println("Total count of odd in "+n+" No.'s="+octr);
}//Close of main
}//Close of class

//OUTPUT
How many number You want to enter? ::10
Enter no:1 ::3
Enter no:2 ::5
Enter no:3 ::6
Enter no:4 ::9
Enter no:5 ::12
Enter no:6 ::21
Enter no:7 ::4
Enter no:8 ::7
Enter no:9 ::10
Enter no:10 ::13
Total count of even in  10 No.'s=4
Total count of odd in 10 No.'s=6
