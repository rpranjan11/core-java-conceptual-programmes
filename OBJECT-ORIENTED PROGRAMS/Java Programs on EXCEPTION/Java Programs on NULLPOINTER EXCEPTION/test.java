import java.util.Scanner;

class test {
    static Scanner s;
    public static void main(String args[]) {
        System.out.println("value in obj ref var s="+s);
        if(s==null)
            System.out.println("Condition met true");
        else
            System.out.println("Condition met false");
    }
}
