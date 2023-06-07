/*Java Application to show the use of "this" keyword */

class Distance{
private int feet, inch;
void accept(int feet, int inch){
this.feet=feet;
this.inch=inch;
}
void output(){
if(inch>=12){
feet=feet+inch/12;
inch=inch%12;}
System.out.println();
System.out.println("Measured Lenfth="+feet+"'"+inch+"\"");
}
Distance addDistance(Distance w){
Distance temp=new Distance();
temp.feet=this.feet+w.feet;
temp.inch=this.inch+w.inch;
return(temp);                    
}
}//Close of class Distance
class ODistance{
public static void main(String args[]){
Distance d=new Distance();
d.accept(5,13);
d.output();
}//Close of main
}//Close of class ODistance

//OUTPUT

Measured Lenfth=6'1"
