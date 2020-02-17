/*Java Application to show the case of  "Call-by-Reference" method/technique" */

import java.util.Scanner;
class Complex{
private int real,imag;
void read(int r, int i){
real=r;
imag=i;
}
void show(){
String ch="+";
if(imag<0)
ch="";
System.out.println(real+ch+imag+"i");
}
Complex addComplex(Complex T){
Complex tmp=new Complex();
tmp.real=real+T.real;
tmp.imag=imag+T.imag;
return(tmp);
}
}//Close of class Complex
class OComplex{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
Complex C1=new Complex();
Complex C2=new Complex();
System.out.println();
System.out.print("Enter value for first complex no. ::");
int real1=s.nextInt();
int imag1=s.nextInt();
//System.out.println(real1);
//System.out.println(imag1);
C1.read(real1,imag1);
C1.show();
System.out.print("Enter value for second complex no. ::");
int real2=s.nextInt();
int imag2=s.nextInt();
//System.out.println(real2);
//System.out.println(imag2);
C2.read(real2,imag2);
C2.show();
System.out.println("After addition of first and second Complex no.--");
Complex C=C1.addComplex(C2);                        //Call-by-Reference
C.show();
}//Close of main
}//Close of class OComplex

//OUTPUT

Enter value for first complex no. ::5
4
5+4i
Enter value for second complex no. ::3
-1
3-1i
After addition of first and second Complex no.--
8+3i
