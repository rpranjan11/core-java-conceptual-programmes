/* java application to handled System defined Exception i:e ArithmeticException by programmer */

import java.util.Scanner;
class Demo1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter value for Numerator	::");
		int nr=s.nextInt();
		System.out.print("Enter value for Denominator	::");
		int dr=s.nextInt();
		try
		{
			int result=nr/dr;
			System.out.println("Division Result="+result);
		}//close of try block
		catch(ArithmeticException x)
		{
			System.out.println(x);
			System.out.println(x.toString());
			System.out.println(x.getMessage());
			x.printStackTrace();
		}//close of catch block
		System.out.println("Continue execution after catch block");
	}//close of main
}//close of class

