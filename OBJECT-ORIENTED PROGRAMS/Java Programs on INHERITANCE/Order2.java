// Implementing diagram (ii)

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
void accept(double w,double h,String c,int l,int a){
input(w,h,c);
legs=l;
arms=a;
}
void disp(){
System.out.println("\nDisplaying Size/Dimension of Object Chair");
output();
System.out.println("No of Legs	="+legs+",No of Arms="+arms);
System.out.println("-------------------------------------------------------------");
}
}//close of subclass Chair

// Defining subclass Bookshelf
class Bookshelf extends Furniture{
private int shelf;
void accept(double w,double h,String c,int s){
input(w,h,c);
shelf=s;
}
void disp(){
System.out.println("\nDisplaying Size/Dimension of Object Bookshelf");
output();
System.out.println("No of shelf	="+shelf);
System.out.println("---------------------------------------------------------------");
}
}//close of subclass Bookshelf

class Order2{
public static void main(String args[]){
Chair c=new Chair();
c.accept(18,24,"Brown",5,2);
c.disp();
Bookshelf b=new Bookshelf();
b.accept(36,60,"Grey",6);
b.disp();
}//close of main
}//close of Order2 class

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
---------------------------------------------------------------
*/
