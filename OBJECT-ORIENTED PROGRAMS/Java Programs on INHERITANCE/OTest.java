/* java application to show the order of execution of constructors in case
of Inheritance and uses of super keyword */

//Defining Superclass S
class S{
private int svar;
protected S(){
System.out.println("Superclass 'S' default Constructor called");
svar=10;
}
protected S(int m){
System.out.println("Superclass 'S' Parameterised Constructor called");
svar=m;
}
protected void disp(){
System.out.println("value in Superclass 'S' variable svar="+svar);
}
}//close of superclass S

//Defining subclass D
class D extends S{
private int dvar;
D(){
System.out.println("Subclass 'D' default Constructor called");
dvar=5;
}
D(int m,int n){
super(m);
System.out.println("Subclass 'D' Parameterised Constructor called");
dvar=n;
}
public void disp(){
super.disp();
System.out.println("Value in Subclass 'D' variable dvar="+dvar);
}
}//close of subclass 'D'

class OTest{
public static void main(String args[]){
D x=new D();
x.disp();
D x1=new D(29,39);
x1.disp();
}//close of main
}//close of class  OTest

/* OUTPUT
Superclass 'S' default Constructor called
Subclass 'D' default Constructor called
value in Superclass 'S' variable svar=10
Value in Subclass 'D' variable dvar=5
Superclass 'S' Parameterised Constructor called
Subclass 'D' Parameterised Constructor called
value in Superclass 'S' variable svar=29
Value in Subclass 'D' variable dvar=39
*/