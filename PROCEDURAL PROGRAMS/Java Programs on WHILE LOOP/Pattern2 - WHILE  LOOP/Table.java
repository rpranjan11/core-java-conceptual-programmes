/*9.Write a java application to accept an integer number, calculate and print its corresponding table.*/

import java.util.Scanner;
class Table{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=1,prod=1;
System.out.println();
System.out.print("Enter an integer No. whose table is to be generated:");
int num=s.nextInt();
//System.out.println(num);
while(i<=10){
prod=num*i;
System.out.println(num+"x"+i+"="+prod);
i++;
}//Close of while
}//Close of main
}//Close of class

//OUTPUT
Enter an integer No. whose table is to be generated:5
5x1=5
5x2=10
5x3=15
5x4=20
5x5=25
5x6=30
5x7=35
5x8=40
5x9=45
5x10=50
