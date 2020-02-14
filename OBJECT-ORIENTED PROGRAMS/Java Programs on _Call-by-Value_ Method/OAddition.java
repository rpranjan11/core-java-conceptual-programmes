/*Java Application to show the case of "Call-by-Value" method/technique */

class Addition{
private double num1,num2;
void accept(double m,double n){
num1=m;
num2=n;
}
double sum(){
return(num1+num2);          
}
void disp(){
System.out.println();
System.out.println("Sum of two Nos. "+num1+"and"+num2+"="+sum());
}
}//Close of class Addition
class OAddition{
public static void main(String args[]){
Addition A=new Addition();
A.accept(10,20);                                           //Call-by-Value   
A.disp();
}//Close of main
}//Close of class OAddition

//OUTPUT

Sum of two Nos. 10.0and20.0=30.0
