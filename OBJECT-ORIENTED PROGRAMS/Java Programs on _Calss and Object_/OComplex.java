/* 3.Create a class named Complex that consists following members to store    and print Complex No.
#.define instance variables real(int) and imag(int) to store Complex No.
#.define constructors to support automatic initialisation.
#define changeComplexNo(int,int) to change the Complex No.
#.define Complex addComplexNo(Complex) to add to Complex objects.
#.define printComplexNo() to print the Complex No.
Display the complete functionality
[Make suitable assumption if necessary]                                                     */

import java.util.Scanner;
class Complex{
private int real,imag;
Complex(){}
Complex(int real,int imag){
this.real=real;
this.imag=imag;
}
void changeComplexNo(int real,int imag){
this.real=real;
this.imag=imag;
}
void changeComplexNo(int real){
this.real=real;
}
Complex addComplexNo(Complex x){
Complex temp=new Complex();
temp.real=this.real+x.real;
temp.imag=imag+x.imag;
return (temp);
}
void printComplexNo(){
String ch="";
if(imag>=0)
ch="+";
System.out.println(real+ch+imag+"i");
}
}//close of class Complex
class OComplex{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter real and imaginary value for First Complex No. ::");
int real=s.nextInt();
//System.out.println(real);
int imag=s.nextInt();
//System.out.println(imag);
Complex c1=new Complex(real,imag);
c1.printComplexNo();
System.out.print("Enter real and imaginary value for Second Complex No. ::");
real=s.nextInt();
//System.out.println(real);
imag=s.nextInt();
//System.out.println(imag);
Complex c2=new Complex();
c2.changeComplexNo(real,imag);
c2.printComplexNo();
System.out.print("Enter new real value for Second Complex No. ::");
real=s.nextInt();
//System.out.println(real);
c2.changeComplexNo(real);
c2.printComplexNo();
Complex add=c1.addComplexNo(c2);
System.out.println("Adding First and Second Complex No.------");
c1.printComplexNo();
c2.printComplexNo();
System.out.println("--------------------------------------");
add.printComplexNo();
}//close of main
}//close of class OComplex

//OUTPUT
Enter real and imaginary value for First Complex No. ::5
-2
5-2i
Enter real and imaginary value for Second Complex No. ::8
4
8+4i
Enter new real value for Second Complex No. ::6
6+4i
Adding First and Second Complex No.------
5-2i
6+4i
--------------------------------------
11+2i
