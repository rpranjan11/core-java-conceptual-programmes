/*4.Create a Time class having following members to support input and output of the given time:-
#.define instance variables:-hour(int), min(int), and sec(int) to store time.
#.define constructors to support automatic initialisation of time.
#.define void changeTime(int,int,int) to change existing time.
#.define void changeTime(int,int) to assign/update time.
#.define Time addTime(Time) to add two time object.
#.define void printTime() to display/print time in format:- 
                                          [ hh:mm:ss ]
Display the complete functionality
[Make suitable assumption if necessary]                                                      */

import java.util.Scanner;
class Time{
private int hour,minute,second;
Time(){}
Time(int hour,int minute,int second){
this.hour=hour;
this.minute=minute;
this.second=second;
}
Time(int hour,int minute){
this.hour=hour;
this.minute=minute;
}
void changeTime(int hour,int minute,int second){
this.hour=hour;
this.minute=minute;
this.second=second;
}
void changeTime(int hour,int minute){
this.hour=hour;
this.minute=minute;
}
Time addTime(Time t){
Time temp=new Time();
temp.hour=this.hour+t.hour;
temp.minute=this.minute+t.minute;
temp.second=this.second+t.second;
return (temp);
}
void printTime(){
String hr,mn,sc;
hr=mn=sc="";
if(second>59){
minute=minute+second/60;
second=second%60;
}
if(minute>59){
hour=hour+minute/60;
minute=minute%60;
}
if(hour>23)
hour=0;
if(hour<10)
hr="0";
if(minute<10)
mn="0";
if(second<10)
sc="0";
System.out.println(hr+hour+":"+mn+minute+":"+sc+second);
}
}//close of class Time
class OTime{
public static void  main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println();
System.out.print("Enter First time in hour,min and sec respectively ::");
int hour=s.nextInt();
//System.out.println(hour);
int minute=s.nextInt();
//System.out.println(minute);
int second=s.nextInt();
//System.out.println(second);
Time t1=new Time(hour,minute,second);
t1.printTime();
System.out.print("Enter Second time in hour,min and sec respectively ::");
hour=s.nextInt();
//System.out.println(hour);
minute=s.nextInt();
//System.out.println(minute);
second=s.nextInt();
//System.out.println(second);
Time t2=new Time(hour,minute,second);
t2.printTime();
System.out.print("Enter New Second time in hour,min respectively ::");
hour=s.nextInt();
//System.out.println(hour);
minute=s.nextInt();
//System.out.println(minute);
t2.changeTime(hour,minute);
t2.printTime();
Time add=t1.addTime(t2);
System.out.println("Adding Time in hh:mm:ss format----");
t1.printTime();
t2.printTime();
System.out.println("--------------------------------------");
add.printTime();
}//close of main
}//close of class

//OUTPUT
Enter First time in hour,min and sec respectively ::5
32
50
05:32:50
Enter Second time in hour,min and sec respectively ::8
45
30
08:45:30
Enter New Second time in hour,min respectively ::9
49
09:49:30
Adding Time in hh:mm:ss format----
05:32:50
09:49:30
--------------------------------------
15:22:20
