/* java application to handled System defined Exception i:e ArithmeticException by programmer */
import java.util.Scanner;
class Demo2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter value for Numerator	::");
		int nr=s.nextInt();
		System.out.print("Enter value for Denominator	::");
		int dr=s.nextInt();
		try {
			if(dr==0)
				throw new ArithmeticException("Divide by Zero !");
			System.out.println("Division Result="+nr/dr);
		}//close of try block
		catch(ArithmeticException x) {
			System.out.println(x.getMessage());
			System.out.println(x);
			System.out.println(x.toString());
			x.printStackTrace();
		}//close of catch block
		System.out.println("Continue execution after catch block");
	}//close of main
}//close of class
