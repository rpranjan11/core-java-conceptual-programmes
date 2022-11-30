/*7.Write a java application to accept  n numbers, check and display the total count of positive and negative numbers.*/

import java.util.Scanner;
class PositiveNegative{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,i,num,cpositive,cnegative;
i=num=cpositive=cnegative=0;
System.out.println();
System.out.print("How many No. You want to enter? ::");
n=s.nextInt();
//System.out.println(n);
while(i<n){
System.out.print("Enter no:"+(i+1)+" ::");
num=s.nextInt();
//System.out.println(num);
if(num<0)
cnegative++;
else
cpositive++;
i++;
}//Close of while
System.out.println("Total count of Positive  out of "+n+"No.'s="+cpositive);
System.out.println("Total count of Negative out of "+n+"No.'s="+cnegative);
}//Close of main
}//Close of class

//OUTPUT
How many No. You want to enter? ::5
Enter no:1 ::-2
Enter no:2 ::5
Enter no:3 ::3
Enter no:4 ::-4
Enter no:5 ::-1
Total count of Positive  out of 5No.'s=2
Total count of Negative out of 5No.'s=3
