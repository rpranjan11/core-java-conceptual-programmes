// version (iii) is totally handled by programmer itself 
import java.util.Scanner;
class Demo4{
public static void  main(String arg[]){
Scanner s=null;
boolean flag=true;
String name="";
do{
try{
System.out.print("Enter UserName	::");
if(s==null)
throw new NullPointerException("Object Missing !");
name=s.nextLine().toUpperCase();
System.out.println("UserName		::"+name);
flag=false;
}//close of try block
catch(NullPointerException e){
System.out.println("Exception Caught	::"+e.getMessage());
s=new Scanner(System.in);
} //close of catch block
}while(flag );
}//close of main
}//close of Demo4

