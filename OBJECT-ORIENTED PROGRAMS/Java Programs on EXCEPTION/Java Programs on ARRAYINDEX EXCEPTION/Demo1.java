// version (i) ArrayIndexOutOfBoundsException totally handled by JVM
import java.util.Scanner;
class Demo1{
public static void  main(String args[]){
int num[]={10,20,30,40,50};
Scanner s=new Scanner(System.in);
System.out.print("Enter element index/offset required to be print::");
int i=s.nextInt();
System.out.println("Element value at ["+i+"]="+num[i]);
}//close of main
}//close of class