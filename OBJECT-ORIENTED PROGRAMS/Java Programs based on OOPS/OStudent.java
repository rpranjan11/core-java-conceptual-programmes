/* 3.Create a class named Student that consists following members to support Student Result automation by applying the following condition:-
#.instance variables:-enrolNo(string), sname(string), eprog(string) and marks obtained in vb(double), cpp(double) and java(double). 
#.methods:-
*void accept(string,string,string,double,double,double):-method to accept student informations.
*void printResult():-method to print Student VI semester result
*void calResult():-method to compute/calculate the Student result as per the condition given below:-
1.Each paper(i.e.; language) is of maximum marks 200
2.Pass mark is 40% of the maximum marks
3.Print/display remarks as follows:-
 #if a student passed in all subject(i.e.; languages) and
            70>=aggregate <=100--------Excellent
            60>=aggregate <=69 --------Very Good
            50>=aggregate <=59 --------Good 
            40>=aggregate <=49 --------Pass
            otherwise                  --------FAIL
Display the complete functionality
                   /OR
Write main() method, instantiate object and call all method exactly once.
[Make suitable assumption if necessary]                                                   */

import java.util.*;
class Student{
private String enrolNo,sname,eprog,sem="VI";
private double vb,cpp,java,max=200;
void accept(String eno, String name, String prog, double m_vb, double m_cpp, double m_java){
enrolNo=eno;
sname=name;
eprog=prog;
vb=m_vb;
cpp=m_cpp;
java=m_java;
}
double gtotal(){
return(vb+cpp+java);
}
double aggregate(){
return(gtotal()*100/(max*3));
}
String remarks(){
String rem="FAIL";
double agg=aggregate();
double pass=max*40/100;
if (vb>=pass && cpp>=pass && java>=pass)
  if(agg>=50)
    if(agg<=59)
     rem="GOOD";
    else if (agg<=69)
     rem=" VERY GOOD";
    else
     rem="EXCELLENT";
else
 rem="PASS";
return(rem);
}
void calResult(){
System.out.println("= = = Student Result = = = Dated :"+new Date());
System.out.println("Enrolment No.		:"+enrolNo);
System.out.println("Student Name		:"+sname);
System.out.println("Enrolled-in-Programme	:"+eprog);
System.out.println("Semester.			:"+sem);
System.out.println("Marks obtained in Visual Basic	:"+vb);
System.out.println("Marks obtained in C++	:"+cpp);
System.out.println("Marks obtained in Java	:"+java);
System.out.println("= = = = = = = = = = = = = = = = = =");
System.out.println("Total Marks obtained		:"+gtotal());
System.out.println("Aggregate			:"+aggregate()+"%");
System.out.println("= = = = = = = = = = = = = = = = = =");
System.out.println("Remarks			:"+remarks());
}
}//Close of class Student
class OStudent{
public static void main(String args[]){
Scanner C=new Scanner(System.in);
Student X=new Student();
System.out.println();
System.out.print("Enter Student Enrolment No. 	:");
String eno=C.nextLine().toUpperCase();
//System.out.println(eno);
System.out.print("Enter Student Name 		:");
String name=C.nextLine().toUpperCase();
//System.out.println(name);
System.out.print("Enter Enrolled-in-Programme 	:");
String prog=C.nextLine().toUpperCase();
//System.out.println(prog);
System.out.print("Enter Marks obtained in Visual Basic :");
double vb=C.nextDouble();
//System.out.println(vb);
System.out.print("Enter Marks obtained in C++ 	:");
double cpp=C.nextDouble();
//System.out.println(cpp);
System.out.print("Enter Marks obtained in Java 	:");
double java=C.nextDouble();
//System.out.println(java);
X.accept(eno,name,prog,vb,cpp,java);
X.calResult();
}//Close of main
}//Close of class OStudent

//OUTPUT

Enter Student Enrolment No. 	:S001
Enter Student Name 	:RAJNISH RANJAN
Enter Enrolled-in-Programme 	:BCA
Enter Marks obtained in Visual Basic :160.0
Enter Marks obtained in C++ 	:175.0
Enter Marks obtained in Java 	:189.0
= = = Student Result = = = Dated :Sat Jan 09 20:04:32 IST 2016
Enrolment No.		:S001
Student Name		:RAJNISH RANJAN
Enrolled-in-Programme	:BCA
Semester.			:VI
Marks obtained in Visual Basic	:160.0
Marks obtained in C++	:175.0
Marks obtained in Java	:189.0
= = = = = = = = = = = = = = = = = =
Total Marks obtained	:524.0
Aggregate			:87.33333333333333%
= = = = = = = = = = = = = = = = = =
Remarks			:EXCELLENT
