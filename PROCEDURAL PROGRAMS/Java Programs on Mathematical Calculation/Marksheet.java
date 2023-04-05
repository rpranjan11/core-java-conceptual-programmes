/*3.WJA to accept marks obtained in languages C, C++, Java. Calculate and print the total marks obtained in languages as well as percentage as of each language is of 200 marks.
                            = = = = = MARKSHEET = = = = =
                            Marks Obtained in C       :.......
                            Marks Obtained in C++   :.......
                            Marks Obtained in Java  :.......
                            = = = = = = = = = = = = = = 
                            Total Marks Obtained      :....... 
                            Aggregate                        :.......%                                                                           */


import java.util.Scanner;
class Marksheet{
public static void main(String args[]){
Scanner C=new Scanner(System.in);
System.out.print("Enter marks of language C :");
double c=C.nextDouble();
System.out.print("Enter marks of language C++ :");
double cpp=C.nextDouble();
System.out.print("Enter marks of language Java :");
double java=C.nextDouble();
double tot=c+cpp+java;
double percent=tot/600*100;
System.out.println("= = = = = = MARKSHEET = = = = = =");
System.out.println("Marks Obtained in language C :"+c);
System.out.println("Marks Obtained in language C++ :"+cpp);
System.out.println("Marks Obtained in language Java :"+java);
System.out.println("= = = = = = = = = = = = = = = = =");
System.out.println("Total Marks Obtained :"+tot);
System.out.println("Aggregate \t\t:"+percent+"%");
}//Close of main
}//Close of class