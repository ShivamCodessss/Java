package pkg05_functions;
import java.util.Scanner;

public class practice {
    static int num1 , num2;
    static Scanner sc;
    
    public static void main(String[] args)
    {
        Input();
        add();
    }
    static void Input()
    {
        System.out.println("Enter a number : ");
        num1 = sc.nextInt();
        System.out.println("Enter a number : ");
        num2 = sc.nextInt();
    }
    static void add()
    {
        System.out.println("Addition is :" + (num1 + num2));
    }
}
