//Defining superclass Student
class Student{
private String enrolNo,sname,eprog,address,emailId,mobNo;
private double fee;
protected Student(){
enrolNo=sname=eprog=address=emailId=mobNo="";
}
protected Student(String enrolNo,String sname,String eprog,String address,String emailId,String mobNo,double fee){
this.enrolNo=enrolNo;
this.sname=sname;
this.eprog=eprog;
this.address=address;
this.emailId=emailId;
this.mobNo=mobNo;
this.fee=fee;
}
protected void input(String enrolNo,String sname,String eprog,String address,String emailId,String mobNo,double fee){
this.enrolNo=enrolNo;
this.sname=sname;
this.eprog=eprog;
this.address=address;
this.emailId=emailId;
this.mobNo=mobNo;
this.fee=fee;
}
protected void printStudInfo(){
System.out.println("Enrollment No.				::"+enrolNo.toUpperCase());
System.out.println("Student Name				::"+sname.toUpperCase());
System.out.println("Enrolled in Programme			::"+eprog.toUpperCase());
System.out.println("Address					::"+address.toUpperCase());
System.out.println("Email Identification				::"+emailId);
System.out.println("Mobile No.					::"+mobNo);
System.out.println("Total Fee included Programme+hostel fee in Rs.	::"+fee);
}
protected double  gTotalFee(){
return(fee);
}
}//close of superclass Student

//Defining subclass Hosteler
class Hosteler extends Student{
private String hostelName,hostelRoomNo;
Hosteler(){
hostelName=hostelRoomNo="";
}
Hosteler(String enrolNo,String sname,String eprog,String address,String emailId,String mobNo,double fee,String hostelName,String hostelRoomNo){
super(enrolNo,sname,eprog,address,emailId,mobNo,fee);
this.hostelName=hostelName;
this.hostelRoomNo=hostelRoomNo;
}
void input(String enrolNo,String sname,String eprog,String address,String emailId,String mobNo,double fee,String hostelName,String hostelRoomNo){
input(enrolNo,sname,eprog,address,emailId,mobNo,fee);
this.hostelName=hostelName;
this.hostelRoomNo=hostelRoomNo;
}
public void printStudInfo(){
System.out.println("=========================Displaying Hosteler Information====================");
super.printStudInfo();
System.out.println("Hostel Name			::"+hostelName);
System.out.println("Hostel Room No			::"+hostelRoomNo);
System.out.println("========================================================================\n");
}
}//close of subclass Hosteler

//Defining subclass DayScholar
class DayScholar extends Student{
private double hostelFeeDed;
DayScholar(){}
DayScholar(String enrolNo,String sname,String eprog,String address,String emailId,String mobNo,double fee,double hostelFeeDed){
super(enrolNo,sname,eprog,address,emailId,mobNo,fee);
this.hostelFeeDed=hostelFeeDed;
}
void input(String enrolNo,String sname,String eprog,String address,String emailId,String mobNo,double fee,String hostelName,String hostelRoomNo){
input(enrolNo,sname,eprog,address,emailId,mobNo,fee);
this.hostelFeeDed=hostelFeeDed;
}
public void printStudInfo(){
System.out.println("=========================Displaying DayScholar Information====================");
super.printStudInfo();
System.out.println("Hostel Fee Deduction in Rs.			::"+hostelFeeDed);
System.out.println("--------------------------------------------------------------------------------------------------------------------");
System.out.println("Net Fee in Rs. (Excluded Hostel Fee)		::"+(gTotalFee()-hostelFeeDed));
System.out.println("==========================================================================\n");
}
}//close of subclass DayScholar

class StudInfo{
public static void main(String args[]){
Hosteler H=new Hosteler("S001","Amit Kumar","BCA","C-64,Chennai-14","amit10@gmail.com","+918345678910",35000,"Ganga Devi","B-30");
DayScholar D=new DayScholar("S090","Vinay Singh","BCA","D-105, Kolkata-90","vinay21@yahoo.com","+918453689410",35000,15000);
Student S;
S=H;
S.printStudInfo();
S=D;
S.printStudInfo();
}//close of main
}//close of StudInfo class

/* OUTPUT 

========================Displaying Hosteler Information====================
Enrollment No.				::S001
Student Name				::AMIT KUMAR
Enrolled in Programme			::BCA
Address					::C-64,CHENNAI-14
Email Identification				::amit10@gmail.com
Mobile No.					::+918345678910
Total Fee included Programme+hostel fee in Rs.	::35000.0
Hostel Name				::Ganga Devi
Hostel Room No				::B-30
========================================================================

=========================Displaying DayScholar Information====================
Enrollment No.				::S090
Student Name				::VINAY SINGH
Enrolled in Programme			::BCA
Address					::D-105, KOLKATA-90
Email Identification				::vinay21@yahoo.com
Mobile No.				::+918453689410
Total Fee included Programme+hostel fee in Rs.	::35000.0
Hostel Fee Deduction in Rs.			::15000.0
--------------------------------------------------------------------------------------------------------------------
Net Fee in Rs. (Excluded Hostel Fee)		::20000.0
==========================================================================

*/