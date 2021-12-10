/* Java application to show the use of "default" and "parameterised" constructor */

import java.util.Scanner;
class Chair1{
private double width=18.0, height=24.0;
private int legs=4, arms;
private String color="Black";
Chair1(){}
Chair1(int legs, int arms,String color){
this.legs=legs;
this.arms=arms;
this.color=color;
}
Chair1(int legs, int arms){
this.legs=legs;
this.arms=arms;
}
Chair1(double width,double height,int legs, int arms,String color){
this.width=width;
this.height=height;
this.legs=legs;
this.arms=arms;
this.color=color;
}
void accept(double width,double height,int legs, int arms,String color){
this.width=width;
this.height=height;
this.legs=legs;
this.arms=arms;
this.color=color;
}
void print(){
System.out.println("Dimension/Size of chair to be made ::");
System.out.println("Width="+width+"\"");
System.out.println("Height="+height+"\"");
System.out.println("No. of Legs="+legs);
System.out.println("No. of Arms="+arms);
System.out.println("Color="+color);
}
}//Close of class Chair1
class OChair1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
Chair1 C1=new Chair1();
System.out.println();
C1.print();
System.out.print("Enter Legs, Arms and Color of Chair :");
int legs=s.nextInt();
//System.out.println(legs);
int arms=s.nextInt();
//System.out.println(arms);
s.nextLine();
String color=s.nextLine().toUpperCase();
//System.out.println(color);
Chair1 C2=new Chair1(legs,arms,color);
C2.print();
System.out.print("Enter Legs and Arms of Chair :");
legs=s.nextInt();
//System.out.println(legs);
arms=s.nextInt();
//System.out.println(arms);
Chair1 C3=new Chair1(legs,arms);
C3.print();
System.out.print("Enter Width, Height, Legs, Arms and Color of Chair :");
double width=s.nextDouble();
//System.out.println(width);
double height=s.nextDouble();
//System.out.println(height);
legs=s.nextInt();
//System.out.println(legs);
arms=s.nextInt();
//System.out.println(arms);
s.nextLine();
color=s.nextLine().toUpperCase();
//System.out.println(color);
Chair1 C4=new Chair1(width,height,legs,arms,color);
C4.print();
System.out.print("Enter Width, Height, Legs, Arms and Color of Chair :");
width=s.nextDouble();
//System.out.println(width);
height=s.nextDouble();
//System.out.println(height);
legs=s.nextInt();
//System.out.println(legs);
arms=s.nextInt();
//System.out.println(arms);
s.nextLine();
color=s.nextLine().toUpperCase();
//System.out.println(color);
Chair1 C5=new Chair1();
C5.accept(width,height,legs,arms,color);
C5.print();
}//Close of main
}//Close of class OChair

//OUTPUT
Dimension/Size of chair to be made ::
Width=18.0"
Height=24.0"
No. of Legs=4
No. of Arms=0
Color=Black
Enter Legs, Arms and Color of Chair :5
2
BROWN
Dimension/Size of chair to be made ::
Width=18.0"
Height=24.0"
No. of Legs=5
No. of Arms=2
Color=BROWN
Enter Legs and Arms of Chair :4
2
Dimension/Size of chair to be made ::
Width=18.0"
Height=24.0"
No. of Legs=4
No. of Arms=2
Color=Black
Enter Width, Height, Legs, Arms and Color of Chair :20.0
24.0
5
0
METALLIC STEEL
Dimension/Size of chair to be made ::
Width=20.0"
Height=24.0"
No. of Legs=5
No. of Arms=0
Color=METALLIC STEEL
Enter Width, Height, Legs, Arms and Color of Chair :22.0
26.0
3
2
GREY
Dimension/Size of chair to be made ::
Width=22.0"
Height=26.0"
No. of Legs=3
No. of Arms=2
Color=GREY
