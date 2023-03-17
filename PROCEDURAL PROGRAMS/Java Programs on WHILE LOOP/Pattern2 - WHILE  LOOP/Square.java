/*10.Write a java application to accept a natural number,calculate and print the square upto the inputed natural number. */

import java.util.Scanner;
class Square{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=1,n;
System.out.println();
System.out.print("How many numbers You want to square? ::");
n=s.nextInt();
//System.out.println(n);
while(i<=n){
System.out.println("Square of "+i+" is"+i+"x"+i+"="+(i*i));
i++;
}//Close of while
}//Close of main
}//Close of class

//OUTPUT
How many numbers You want to square? ::10
Square of 1 is1x1=1
Square of 2 is2x2=4
Square of 3 is3x3=9
Square of 4 is4x4=16
Square of 5 is5x5=25
Square of 6 is6x6=36
Square of 7 is7x7=49
Square of 8 is8x8=64
Square of 9 is9x9=81
Square of 10 is10x10=100
