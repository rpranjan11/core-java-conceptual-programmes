

/* Implementing diagram (V) that covers the topics
 DYNAMIC DISPATCH METHOD AND RUN-TIME POLYMORPHISM */

import java.util.Scanner; 
// Defining superclass Furniture
class Furniture{
private double width,height;
private String color;
protected Furniture(){
System.out.println("Superclass Furniture Default constructor called");
}
protected Furniture(double w,double h,String c){
System.out.println("Superclass Furniture Parameterised Constructor called");
width=w;
height=h;
color=c;
}

protected void input(double w,double h,String c){
width=w;
height=h;
color=c;
}
protected void output(){
System.out.println("Width="+width+"\"");
System.out.println("Height="+height+"\"");
System.out.println("Color="+color);
}
}//close of superclass Furniture

// Defining subclass Chair
class Chair extends Furniture{
private int legs,arms;
Chair(){
System.out.println("Subclass Chair Default Constructor called");
input(18,24,"Black");
legs=4;
arms=1;
}
Chair(double w,double h,String c,int l,int a){
super(w,h,c);
System.out.println("Subclass Chair Parameterised Constructor called");
legs=l;
arms=a;
}
void input(double w,double h,String c,int l,int a){
input(w,h,c);
legs=l;
arms=a;
}
public void output(){
System.out.println("\nDisplaying Size/Dimension of Object Chair");
super.output();
System.out.println("No of Legs	="+legs+",No of Arms="+arms);
System.out.println("-------------------------------------------------------------");
}
}//close of subclass Chair

// Defining subclass Bookshelf
class Bookshelf extends Furniture{
private int shelf;
Bookshelf(){
System.out.println("Subclass Bookshelf Default constructor called");
input(36,60,"Grey");
shelf=7;
}
Bookshelf(double w,double h,String c,int s){
super(w,h,c);
System.out.println("Subclass Bookshelf Parameterised Constructor called");
shelf=s;
}
void input(double w,double h,String c,int s){
input(w,h,c);
shelf=s;
}
public void output(){
System.out.println("\nDisplaying Size/Dimension of Object Bookshelf");
super.output();
System.out.println("No of shelf	="+shelf);
System.out.println("---------------------------------------------------------------");
}
}//close of subclass Bookshelf

class Order5{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
Chair C=new Chair();
Bookshelf B=new Bookshelf();
Furniture F;
F=C;
F.output();
F=B;
F.output();
/*
System.out.print("Input Chair size/dimension.....\n");
System.out.print("Enter Width of  the Chair::");
double w=s.nextDouble();
System.out.print("Enter Height of the Chair::");
double h=s.nextDouble();
System.out.print("Enter Color::");
String c=s.nextLine();
System.out.print("Enter No of legs::");
int l=s.nextInt();
System.out.print("Enter No of Arms::");
int a=s.nextInt();
Chair c2=new Chair(w,h,c,l,a);
c2.output();
*/
}//close of main
}//close of Order5 class

/* OUTPUT */
Superclass Furniture Default constructor called
Subclass Chair Default Constructor called
Superclass Furniture Default constructor called
Subclass Bookshelf Default constructor called

Displaying Size/Dimension of Object Chair
Width=18.0"
Height=24.0"
Color=Black
No of Legs	=4,No of Arms=1
-------------------------------------------------------------

Displaying Size/Dimension of Object Bookshelf
Width=36.0"
Height=60.0"
Color=Grey
No of shelf	=7
---------------------------------------------------------------
