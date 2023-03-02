/* 2.Create a class named Time that consists following members to store and print time in "hh:mm:ss" format:-
#.instance variables:-hour(int), min(int), and sec(int) to store time.
#.methods:-
*void atime(int,int,int):-method to accept three arguments respectively hour(int), min(int), and sec(int).
*void ptime():-method to print stored time in format "hh:mm:ss" 
*Time addTime(Time):-method to add two time object.
Display the complete functionality
                   /OR
Write main() method, instantiate object and call all method exactly once.
[Make suitable assumption if necessary]                                                      */

import java.util.Scanner;
class Time{
private int hour,min,sec;
void atime(int h, int m, int s){
hour=h;
min=m;
sec=s;
}
void ptime(){
if (sec>59){
min=min+sec/60;            //min+=sec/60;
sec=sec%60;                   //sec%=60
}
if (min>59){
hour=hour+min/60;            //hour+=min/60;
min=min%60;                   //min%=60
}
if (hour>23)
hour=0;
String hr="";
String mn="";
String sc="";
if (hour<10)
hr="0";
if (min<10)
mn="0";
if (sec<10)
sc="0";
System.out.println(hr+hour+":"+mn+min+":"+sc+sec);
}//Close of ptime
Time addTime(Time T){
Time tm=new Time();
tm.hour=hour+T.hour;
tm.min=min+T.min;
tm.sec=sec+T.sec;
return(tm);
}
}//Close of class Time
class OTime{
public static void main(String args[]){
Scanner B=new Scanner(System.in);
Time T1=new Time();
Time T2=new Time();
System.out.println();
System.out.print("Enter Time respectively in hour, min and sec ::");
int h1=B.nextInt();
int m1=B.nextInt();
int s1=B.nextInt();
//System.out.println(h1);
//System.out.println(m1);
//System.out.println(s1);
T1.atime(h1,m1,s1);
T1.ptime();
System.out.print("Enter Time respectively in hour, min and sec ::");
int h2=B.nextInt();
int m2=B.nextInt();
int s2=B.nextInt();
//System.out.println(h2);
//System.out.println(m2);
//System.out.println(s2);
T2.atime(h2,m2,s2);
T2.ptime();
Time tm=T1.addTime(T2);
System.out.println("--------------------------");
tm.ptime();
}//Close of main
}//Close of class OTime

//OUTPUT

Enter Time respectively in hour, min and sec ::5
42
55
05:42:55
Enter Time respectively in hour, min and sec ::6
40
50
06:40:50
--------------------------
12:23:45
