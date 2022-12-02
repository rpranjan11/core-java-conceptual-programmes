// Implementing diagram (i)

// Defining superclass Furniture
class Furniture{
double width,height;
String color;
}//close of superclass Furniture

// Defining subclass Chair
class Chair extends Furniture{
private int legs,arms;
void accept(double w,double h,String c,int l,int a){
width=w;height=h;color=c;
legs=l;arms=a;
}
void disp(){
System.out.println("\nDisplaying Size/Dimension of Object Chair");
System.out.println("Width="+width+"\""+",Height="+height+"\"");
System.out.println("Color	="+color);
System.out.println("No of Legs	="+legs+",No of Arms="+arms);
System.out.println("-------------------------------------------------------------");
}
}//close of subclass Chair

// Defining subclass Bookshelf
class Bookshelf extends Furniture{
private int shelf;
void accept(double w,double h,String c,int s){
width=w;height=h;color=c;
shelf=s;
}
void disp(){
System.out.println("\nDisplaying Size/Dimension of Object Bookshelf");
System.out.println("Width="+width+"\""+",Height="+height+"\"");
System.out.println("Color	="+color);
System.out.println("No of shelf	="+shelf);
System.out.println("---------------------------------------------------------------");
}
}//close of subclass Bookshelf

class Order{
public static void main(String args[]){
Chair c=new Chair();
c.accept(18,24,"Brown",5,2);
c.disp();
Bookshelf b=new Bookshelf();
b.accept(36,60,"Black",6);
b.disp();
}//close of main
}//close of Order class

//OUTPUT
/*

Displaying Size/Dimension of Object Chair
Width=18.0",Height=24.0"
Color	=Brown
No of Legs	=5,No of Arms=2
-------------------------------------------------------------

Displaying Size/Dimension of Object Bookshelf
Width=36.0",Height=60.0"
Color	=Black
No of shelf	=6
---------------------------------------------------------------
*/