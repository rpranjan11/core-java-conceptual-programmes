/* Java application to show the use of default constructor */

class Chair{
private double width, height;
private int legs, arms;
private String color;
Chair(){
System.out.println("Default Constructor called");
width=18.0;
height=24.0;
legs=4;
color="Brown";
}
void print(){
System.out.println("Dimension/Size of chair to be made ::");
System.out.println("Width="+width+"\"");
System.out.println("Height="+height+"\"");
System.out.println("No. of Legs="+legs);
System.out.println("No. of Arms="+arms);
System.out.println("Color="+color);
}
}//Close of class Chair
class OChair{
public static void main(String args[]){
Chair C1=new Chair();
C1.print();
}//Close of main
}//Close of class OChair


//OUTPUT
Default Constructor called
Dimension/Size of chair to be made ::
Width=18.0"
Height=24.0"
No. of Legs=4
No. of Arms=0
Color=Brown
