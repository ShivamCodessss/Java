package pkg08_functions_exc01;
import java.util.Scanner;

public class Main {
    static int Hindi, English, Maths, Science;
    static Scanner sc;
    public static void main(String[] args) {
        input();
        calculation();
    }
    static void input()
    {
        sc = new Scanner(System.in);
        System.out.print("Hindi : ");
        Hindi = sc.nextInt();
        System.out.print("English : ");
        English = sc.nextInt();
        System.out.print("Maths : ");
        Maths = sc.nextInt();
        System.out.print("Science : ");
        Science = sc.nextInt();
    }
    static void calculation()
    {
        System.out.println("Total Numbers : " + (Hindi + English + Maths + Science));
        System.out.println("Average : " + (Hindi + English + Maths + Science)/4);
    }
    
}
