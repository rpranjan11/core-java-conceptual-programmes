/*Java Application to show the case of "Method Overloading" */

class Addition{
int sum(int a,int b){
return(a+b);
}
double sum(double a,double b){
return(a+b);          
}
double sum(int a,int b, double c){
return(a+b+c);
}
double sum(double a,int b, int c){
return(a+b+c);
}
}//Close of class Addition
class OAddition{
public static void main(String args[]){
Addition A=new Addition();
int x=10, y=20;
double z=1.1, w=2.2;
System.out.println();
System.out.println("Sum of two Nos."+x+"and"+y+"="+A.sum(x,y));
System.out.println("Sum of two Nos."+z+"and"+w+"="+A.sum(z,w));

System.out.println("Sum of three Nos."+x+","+y+"and"+z+"="+A.sum(x,y,z));

System.out.println("Sum of three Nos."+z+","+x+"and"+y+"="+A.sum(z,x,y));
}//Close of main
}//Close of class OAddition

//OUTPUT

Sum of two Nos.10and20=30
Sum of two Nos.1.1and2.2=3.3000000000000003
Sum of three Nos.10,20and1.1=31.1
Sum of three Nos.1.1,10and20=31.1
