/*5.Write a java application to print the given message format:-
     1  2  3  4  5...............upto n.          */

import java.util.Scanner;
class Pattern1E{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("How many natural no. You want to display ::");
int n=s.nextInt();
System.out.println(n);
int x=1;
while(x<=n){
System.out.print(x+"  ");
x++;
}//Close of while
}//Close of main
}//Close of class

//OUTPUT
How many natural no. You want to display ::15
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  
How many natural no. You want to display ::20
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  