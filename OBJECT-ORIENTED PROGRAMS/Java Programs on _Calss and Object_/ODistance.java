/*5.Create a Distance class that consists following members to store and print length of the object.
#.define instance variables feet(int) and inch(int).
#.define constructors for automatic initialisation:-
*Distance();
*Distance(int,int);
#.define void changeLength(int,int) to change/update the existing length.
#.define void changeLength(int).
#.define Distance addDistance(Distance) to add two distance object.
#.define void printDistance() to print length of the object in format:-
                                         [ feet'inch" ]
Display the complete functionality
[Make suitable assumption if necessary]                                                       */

import java.util.Scanner;
class Distance{
private int feet, inch;
Distance(){}
Distance(int feet,int inch){
this.feet=feet;
this.inch=inch;
}
void changeLength(int feet,int inch){
this.feet=feet;
this.inch=inch;
}
void changeLength(int inch){
this.inch=inch;
}
Distance addDistance(Distance x){
Distance temp=new Distance();
temp.feet=this.feet+x.feet;
temp.inch=inch+x.inch;
return(temp);
}
void printDistance(){
if(inch>=12){
feet=feet+inch/12;
inch=inch%12;}
System.out.println("Measured Lenfth="+feet+"'"+inch+"\"");
}
}//Close of class Distance
class ODistance{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter measured lenfth(i.e.feet and inch) of first Object ::");
int feet=s.nextInt();
//System.out.println(feet);
int inch=s.nextInt();
//System.out.println(inch);
Distance D1=new Distance(feet,inch);
D1.printDistance();
System.out.print("Enter measured lenfth(i.e.feet and inch) of Second Object ::");
feet=s.nextInt();
//System.out.println(feet);
inch=s.nextInt();
//System.out.println(inch);
Distance D2=new Distance();
D2.changeLength(feet,inch);
D2.printDistance();
System.out.print("Enter new measured lenfth(i.e.inch) of Second Object ::");
inch=s.nextInt();
//System.out.println(inch);
D2.changeLength(inch);
D2.printDistance();
Distance add=D1.addDistance(D2);
System.out.println("Adding First and Second Distance Object------");
D1.printDistance();
D2.printDistance();
System.out.println("-----------------------------------------");
add.printDistance();
}//Close of main
}//Close of class ODistance

//OUTPUT

Enter measured lenfth(i.e.feet and inch) of first Object ::3
10
Measured Lenfth=3'10"
Enter measured lenfth(i.e.feet and inch) of Second Object ::2
11
Measured Lenfth=2'11"
Enter new measured lenfth(i.e.inch) of Second Object ::15
Measured Lenfth=3'3"
Adding First and Second Distance Object------
Measured Lenfth=3'10"
Measured Lenfth=3'3"
-----------------------------------------
Measured Lenfth=7'1"
