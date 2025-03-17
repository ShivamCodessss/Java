package pkg06_function_01;
import java.util.Scanner;


public class Main {
    static int num1 , num2;
    static Scanner sc;

    public static void main(String[] args) {
        input();
        add();
    }
    static void input()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num1 = sc.nextInt();
        System.out.println("Enter a number : ");
        num2 = sc.nextInt();

    }
    static void add()
    {
        System.out.println("Total sum :" + (num1+num2));
    }
}

