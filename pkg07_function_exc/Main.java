package pkg07_function_exc;
import java.util.Scanner;

public class Main {
    static int num;
    static Scanner sc;
    

    
    public static void main(String[] args) {
    input();
    even();
    }
    static void input()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
    }
    static void even()
    {
        for (int i = 1; i <= num ; i++)
        {
            if (i % 2 == 0)
            {
               System.out.println(i);
            }
        }
    }
    
}
