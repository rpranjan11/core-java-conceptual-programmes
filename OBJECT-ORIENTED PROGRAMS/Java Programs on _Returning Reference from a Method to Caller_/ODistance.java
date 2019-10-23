/*Java Application to demonstrate Returning Reference from a Method to Caller */

import java.util.Scanner;
class Distance{
private int feet, inch;
void input(int f, int i){
feet=f;
inch=i;
}
void output(){
if(inch>=12){
feet=feet+inch/12;
inch=inch%12;}
System.out.println("Measured Lenfth="+feet+"'"+inch+"\"");
}
Distance addDistance(Distance x){
Distance temp=new Distance();
temp.feet=feet+x.feet;
temp.inch=inch+x.inch;
return(temp);                    //Returning Reference to Caller
}
}//Close of class Distance
class ODistance{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
Distance D1=new Distance();
Distance D2=new Distance();
System.out.println();
System.out.print("Enter measured lenfth of first Object ::");
int feet1=s.nextInt();
int inch1=s.nextInt();
//System.out.println(feet1);
//System.out.println(inch1);
D1.input(feet1,inch1);
D1.output();
System.out.print("Enter measured lenfth of second Object ::");
int feet2=s.nextInt();
int inch2=s.nextInt();
//System.out.println(feet2);
//System.out.println(inch2);
D2.input(feet2,inch2);
D2.output();
Distance Y=D1.addDistance(D2);
System.out.println("After addition of First and Second Object Distance--");
Y.output();
}//Close of main
}//Close of class ODistance

//OUTPUT

Enter measured lenfth of first Object ::5
10
Measured Lenfth=5'10"
Enter measured lenfth of second Object ::6
11
Measured Lenfth=6'11"
After addition of First and Second Object Distance--
Measured Lenfth=12'9"
