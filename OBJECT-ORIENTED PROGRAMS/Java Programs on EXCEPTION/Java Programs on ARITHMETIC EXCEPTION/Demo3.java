/* java application to handled System defined Exception i:e ArithmeticException by programmer.version iii is the perfect solution */
import java.util.Scanner;
class Demo3 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int dr=0;
		System.out.print("Enter value for Numerator	::");
		int nr=s.nextInt();
		do {
			System.out.print("Enter value for Denominator	::");
			dr=s.nextInt();
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
		}while(dr==0);
	}//close of main
}//close of class
