/*8.Write a java application to accept a number, check and display the total count of even positive no. and odd positive no.*/

import java.util.Scanner;
class PositiveEvenOdd{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,i,num,cpe,cpo;
i=num=cpe=cpo=0;
System.out.println();
System.out.print("How many numbers You want to check? ::");
n=s.nextInt();
//System.out.println(n);
while(i<n){
System.out.print("Enter number"+(i+1)+" ::");
num=s.nextInt();
//System.out.println(num);
if(num>=0&&num%2==0)
cpe++;
else if(num>=0&&num%2!=0)
cpo++;
i++;
}//Close of while
System.out.println("Total even positive No. in "+n+" No.'s="+cpe);
System.out.println("Total odd positive No. in "+n+" No.'s="+cpo);
}//Close of main
}//Close of class

//OUTPUT
How many numbers You want to check? ::10
Enter number1 ::-2
Enter number2 ::3
Enter number3 ::4
Enter number4 ::9
Enter number5 ::1
Enter number6 ::-1
Enter number7 ::10
Enter number8 ::-31
Enter number9 ::22
Enter number10 ::99
Total even positive No. in 10 No.'s=3
Total odd positive No. in 10 No.'s=4
