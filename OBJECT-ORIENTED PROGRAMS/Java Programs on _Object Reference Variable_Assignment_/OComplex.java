/*Java Application to demonstrate "Object Reference Variable Assignment" */

import java.util.Scanner;
class Complex{
private int real,imag;
void input(int r, int i){
real=r;
imag=i;
}
void output(){
String ch="";
if(imag>0)
ch="+";
System.out.println("Complex no.="+real+ch+imag+"i");
}
}//Close of class Complex
class OComplex{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
Complex C=new Complex();
System.out.println();
System.out.print("Enter value for complex no. ::");
int real=s.nextInt();
int imag=s.nextInt();
//System.out.println(real);
//System.out.println(imag);
C.input(real,imag);
Complex X=C;                      //Object Reference Variable Assignment
X.output();
}//Close of main
}//Close of class OComplex

//OUTPUT

Enter value for complex no. ::5
-2
Complex no.=5-2i
