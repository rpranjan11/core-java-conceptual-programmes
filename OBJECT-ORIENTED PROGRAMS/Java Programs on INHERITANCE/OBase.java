

// java application to show the use of Dynamic dispatch method to obtained Run-time Polymorphism
//Defining superclass Base 
class Base{
protected void disp(){
System.out.println("Superclass disp() method called");
}
}//close of Superclass Base

//Defining subclass Derived1
class Derived1 extends Base{
public void disp(){
System.out.println("Subclass Derived1 disp() method called");
super.disp();
}
void show(){
System.out.println("Subclass Derived1 show() method called");
}
}

//Defining subclass Derived2
class Derived2 extends Base{
public void disp(){
System.out.println("Subclass Derived2 disp() method called");
super.disp();
}
void show(){
System.out.println("Subclass Derived2 show() method called");
}
}

class OBase{
public static void main(String args[]){
Derived1 d1=new Derived1();
Derived2 d2=new Derived2();
Base B;
B=d1;
B.disp();
B=d2;
B.disp();
}//close of main
}//close of OBase class

/* OUTPUT */

































Subclass Derived1 disp() method called
Superclass disp() method called
Subclass Derived2 disp() method called
Superclass disp() method called
