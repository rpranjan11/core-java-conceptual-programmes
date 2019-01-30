// version (ii) is a joint venture between Programmer and JVM
import java.util.Scanner;
class Demo2
{
  public static void  main(String arg[])
  {
    Scanner s;
    s=null;
    try
    {
      System.out.print("Enter a String	::");
      String str=s.nextLine();
      System.out.println("Inputted string is "+str);
    }//close of try block
    catch(NullPointerException e){
    System.out.println("call to getMessage	:"+e.getMessage());
    System.out.println("Call to toString	:"+e.toString());
    System.out.println("Call to Object	::"+e);
    System.out.println("Call to printStackTrace() method\n");
    e.printStackTrace();
    } //close of catch block
    System.out.println("\nContinue execution after catch block");
  }//close of main
}//close of Demo2

