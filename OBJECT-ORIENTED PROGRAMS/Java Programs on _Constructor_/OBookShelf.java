/* Java application to show the use of "default" and "parameterised" constructor */

import java.util.Scanner;
class BookShelf{
private double width=36.0, height=60.0;
private int shelf=4;
BookShelf(){}
BookShelf(int shelf){
this.shelf=shelf;
}
BookShelf(double width,double height){
this.width=width;
this.height=height;
}
BookShelf(double width,double height,int shelf){
this.width=width;
this.height=height;
this.shelf=shelf;
}
void input(double width,double height,int shelf){
this.width=width;
this.height=height;
this.shelf=shelf;
}
void show(){
System.out.println("Dimension/Size of BookShelf to be made ::");
System.out.println("Width="+width+"\"");
System.out.println("Height="+height+"\"");
System.out.println("No. of Shelf="+shelf);
}
}//Close of class BookShelf
class OBookShelf{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
BookShelf B1=new BookShelf();
System.out.println();
B1.show();
System.out.print("Enter No. of Shelf of BookShelf :");
int shelf=s.nextInt();
//System.out.println(shelf);
BookShelf B2=new BookShelf(shelf);
B2.show();
System.out.print("Enter Width and Height of BookShelf :");
double width=s.nextDouble();
//System.out.println(width);
double height=s.nextDouble();
//System.out.println(height);
BookShelf B3=new BookShelf(width,height);
B3.show();
System.out.print("Enter Width, Height, and Shelf of BookShelf :");
width=s.nextDouble();
//System.out.println(width);
height=s.nextDouble();
//System.out.println(height);
shelf=s.nextInt();
//System.out.println(shelf);
BookShelf B4=new BookShelf(width,height,shelf);
B4.show();
System.out.print("Enter Width, Height, and Shelf of BookShelf :");
width=s.nextDouble();
//System.out.println(width);
height=s.nextDouble();
//System.out.println(height);
shelf=s.nextInt();
//System.out.println(shelf);
BookShelf B5=new BookShelf();
B5.input(width,height,shelf);
B5.show();
}//Close of main
}//Close of class OChair

//OUTPUT
Dimension/Size of BookShelf to be made ::
Width=36.0"
Height=60.0"
No. of Shelf=4
Enter No. of Shelf of BookShelf :5
Dimension/Size of BookShelf to be made ::
Width=36.0"
Height=60.0"
No. of Shelf=5
Enter Width and Height of BookShelf :30.0
48.0
Dimension/Size of BookShelf to be made ::
Width=30.0"
Height=48.0"
No. of Shelf=4
Enter Width, Height, and Shelf of BookShelf :36.0
90.0
5
Dimension/Size of BookShelf to be made ::
Width=36.0"
Height=90.0"
No. of Shelf=5
Enter Width, Height, and Shelf of BookShelf :30.0
72.0
4
Dimension/Size of BookShelf to be made ::
Width=30.0"
Height=72.0"
No. of Shelf=4
