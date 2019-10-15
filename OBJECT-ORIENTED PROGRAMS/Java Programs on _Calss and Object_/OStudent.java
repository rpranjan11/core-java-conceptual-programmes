/* 6.Create a Student class that consists following members to support Student Result automation by applying the following condition:-
#.define instance variables enrolNo(string), sname(string), eprog(string) and marks obtained in vb(double), cpp(double) and java(double) of the Student. 
#.define constructors to support automatic initialisation.
#.define void input(string,string,string,double,double,double) method to accept student informations and obtained marks in semester exam.
#.define methods to compute/calculate the Student result as per the given condition below:-
*Each paper(i.e.; language) is of maximum marks "150"
*Pass mark is 30% of the maximum marks
*Calculate remarks according to the condition below:-
 if a student passed in all subject(i.e.; languages) and
            80%>=aggregate <=100%--------Excellent
            60%>=aggregate <=79%  --------Very Good
            40%>=aggregate <=59%  --------Good 
            30%>=aggregate <=39%  --------Pass
            otherwise                         --------FAIL
#.define printResult() method to print Student VI semester result.
Display the complete functionality
[Make suitable assumption if necessary]                                                   */

import java.util.*;
class Student{
private String enrolNo,sname,eprog,sem="VI";
private double vb,cpp,java,max=150;
Student(){}
Student(String enrolNo,String sname,String eprog,double vb,double cpp,double java){
this.enrolNo=enrolNo;
this.sname=sname;
this.eprog=eprog;
this.vb=vb;
this.cpp=cpp;
this.java=java;
}
void input(String enrolNo,String sname,String eprog,double vb,double cpp,double java){
this.enrolNo=enrolNo;
this.sname=sname;
this.eprog=eprog;
this.vb=vb;
this.cpp=cpp;
this.java=java;
}
double getTotal(){
return(vb+cpp+java);
}
double aggregate(){
return(getTotal()*100/(max*3));
}
String remarks(){
String rem="FAIL";
double agg=aggregate();
double pass=max*30/100;
if (vb>=pass && cpp>=pass && java>=pass)
  if(agg>=40)
   if(agg<=59)
    rem="GOOD";  
   else if(agg<=79)
    rem=" VERY GOOD";
    else
    rem="EXCELLENT";
else
 rem="PASS";
return(rem);
}
void printResult(){
System.out.println("= = = Student Result = = = Dated :"+new Date());
System.out.println("Enrolment No.			:"+enrolNo);
System.out.println("Student Name			:"+sname);
System.out.println("Enrolled-in-Programme		:"+eprog);
System.out.println("Semester				:"+sem);
System.out.println("Marks obtained in Visual Basic		:"+vb);
System.out.println("Marks obtained in C++		:"+cpp);
System.out.println("Marks obtained in Java		:"+java);
System.out.println("----------------------------------------------------------------------");
System.out.println("Total Marks obtained			:"+getTotal());
System.out.println("Aggregate				:"+aggregate()+"%");
System.out.println("----------------------------------------------------------------------");
System.out.println("Remarks				:"+remarks());
System.out.println("=================================================");
}
}//Close of class Student
class OStudent{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("Begin Inserting Student Information..........");
System.out.print("Enter Student Enrolment No.		:");
String enrolNo=s.nextLine().toUpperCase();
//System.out.println(enrolNo);
System.out.print("Enter Student Name			:");
String sname=s.nextLine().toUpperCase();
//System.out.println(sname);
System.out.print("Enter Enrolled-in-Programme		:");
String eprog=s.nextLine().toUpperCase();
//System.out.println(eprog);
System.out.print("Enter Marks obtained in Visual Basic	:");
double vb=s.nextDouble();
//System.out.println(vb);
System.out.print("Enter Marks obtained in C++		:");
double cpp=s.nextDouble();
//System.out.println(cpp);
System.out.print("Enter Marks obtained in Java		:");
double java=s.nextDouble();
//System.out.println(java);
Student X=new Student(enrolNo,sname,eprog,vb,cpp,java);
X.printResult();
System.out.println("Begin Inserting Student Information..........");
System.out.print("Enter Student Enrolment No.		:");
s.nextLine();
enrolNo=s.nextLine().toUpperCase();
//System.out.println(enrolNo);
System.out.print("Enter Student Name			:");
sname=s.nextLine().toUpperCase();
//System.out.println(sname);
System.out.print("Enter Enrolled-in-Programme		:");
eprog=s.nextLine().toUpperCase();
//System.out.println(eprog);
System.out.print("Enter Marks obtained in Visual Basic	:");
vb=s.nextDouble();
//System.out.println(vb);
System.out.print("Enter Marks obtained in C++		:");
cpp=s.nextDouble();
//System.out.println(cpp);
System.out.print("Enter Marks obtained in Java		:");
java=s.nextDouble();
//System.out.println(java);
Student Y=new Student();
Y.input(enrolNo,sname,eprog,vb,cpp,java);
Y.printResult();
}//Close of main
}//Close of class OStudent

//OUTPUT

Begin Inserting Student Information..........
Enter Student Enrolment No.		:S001
Enter Student Name			:RAJNISH RANJAN
Enter Enrolled-in-Programme		:BCA
Enter Marks obtained in Visual Basic	:111.0
Enter Marks obtained in C++		:122.0
Enter Marks obtained in Java		:133.0
= = = Student Result = = = Dated :Mon Jan 11 17:43:14 IST 2016
Enrolment No.			:S001
Student Name			:RAJNISH RANJAN
Enrolled-in-Programme		:BCA
Semester				:VI
Marks obtained in Visual Basic		:111.0
Marks obtained in C++		:122.0
Marks obtained in Java		:133.0
----------------------------------------------------------------------
Total Marks obtained		:366.0
Aggregate				:81.33333333333333%
----------------------------------------------------------------------
Remarks				:EXCELLENT
=================================================
Begin Inserting Student Information..........
Enter Student Enrolment No.		:S002
Enter Student Name			:ADITYA KUMAR
Enter Enrolled-in-Programme		:BCA
Enter Marks obtained in Visual Basic	:100.0
Enter Marks obtained in C++		:111.0
Enter Marks obtained in Java		:105.0
= = = Student Result = = = Dated :Mon Jan 11 17:44:36 IST 2016
Enrolment No.			:S002
Student Name			:ADITYA KUMAR
Enrolled-in-Programme		:BCA
Semester				:VI
Marks obtained in Visual Basic		:100.0
Marks obtained in C++		:111.0
Marks obtained in Java		:105.0
----------------------------------------------------------------------
Total Marks obtained		:316.0
Aggregate				:70.22222222222223%
----------------------------------------------------------------------
Remarks				: VERY GOOD
=================================================
