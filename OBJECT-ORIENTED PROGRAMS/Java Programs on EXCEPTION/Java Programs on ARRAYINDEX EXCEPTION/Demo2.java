// version (ii) ArrayIndexOutOfBoundsException handled jointly by jvm and programmer 
import java.util.Scanner;
class Demo2{
public static void  main(String args[]){
int num[]={10,20,30,40,50};
Scanner s=new Scanner(System.in);
try{
System.out.print("Enter element index/offset required to be print::");
int i=s.nextInt();
System.out.println("Element value at ["+i+"]="+num[i]);
}//close of try block
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e.getMessage());
System.out.println(e.toString());
System.out.println(e);
e.printStackTrace();
}//close of catch block
System.out.println("Continue execution after catch block");
}//close of main
}//close of class