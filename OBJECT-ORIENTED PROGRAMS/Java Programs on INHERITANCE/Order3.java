// Implementing diagram (iii) that covers the topics overridden,overridding and super keyword

// Defining superclass Furniture
class Furniture{
private double width,height;
private String color;
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

class Order3{
public static void main(String args[]){
Chair c=new Chair();
c.input(18,24,"Brown",5,2);
c.output();
Bookshelf b=new Bookshelf();
b.input(36,60,"Grey",6);
b.output();
}//close of main
}//close of Order3 class

/* OUTPUT 

Displaying Size/Dimension of Object Chair
Width=18.0"
Height=24.0"
Color=Brown
No of Legs	=5,No of Arms=2
-------------------------------------------------------------

Displaying Size/Dimension of Object Bookshelf
Width=36.0"
Height=60.0"
Color=Grey
No of shelf	=6
---------------------------------------------------------------*/