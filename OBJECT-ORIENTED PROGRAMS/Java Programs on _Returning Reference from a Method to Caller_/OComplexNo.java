/*Java Application to demonstrate Returning Reference from a Method to Caller */

import java.util.Scanner;
class ComplexNo{
private int real,imag;
void insert(int r, int i){
real=r;
imag=i;
}
void display(){
if (imag>0)
System.out.println(real+"+"+imag+"i");
else
System.out.println(real+""+imag+"i");
}
ComplexNo addComplexNo(ComplexNo x){
ComplexNo C=new ComplexNo();
C.real=real+x.real;
C.imag=imag+x.imag;
return(C);                    //Returning Reference to Caller
}
}//Close of class ComplexNo
class OComplexNo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
ComplexNo C1=new ComplexNo();
ComplexNo C2=new ComplexNo();
System.out.println();
System.out.print("Enter value for first complex no. ::");
int real1=s.nextInt();
int imag1=s.nextInt();
System.out.println(real1);
System.out.println(imag1);
C1.insert(real1,imag1);
C1.display();
System.out.print("Enter value for second complex no. ::");
int real2=s.nextInt();
int imag2=s.nextInt();
System.out.println(real2);
System.out.println(imag2);
C2.insert(real2,imag2);
C2.display();
ComplexNo Y=C1.addComplexNo(C2);
System.out.println("After addition of First and Second Complex No.--");
Y.display();
}//Close of main
}//Close of class OComplexNo

//OUTPUT
Enter value for first complex no. ::5
4
5+4i
Enter value for second complex no. ::6
-3
6-3i
After addition of First and Second Complex No.--
11+1i
