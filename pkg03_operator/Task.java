package pkg03_operator;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Task {

    public static void  main(String args[])
    {
        int a = 10, b = 10, c = 20;
        if((a >= b) && (a >= c))
        {
            System.out.println("True");
        }
        else if ((b >= a) && (b >= c))
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("Both are false");
        }
        
        
        // Task 2 
        // calcualte the volume of cube
        
        int side;
        double volCu;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the slide of cube :");
        side = sc.nextInt();
        
        volCu = (side * side * side);
        System.out.println(" The volume of a cube is : " + volCu);
        
        
        //Task 3
        // Calculate the Volume of a cyclinder 
        int radius , height; 
        double VolCy;
        final double PI = 3.14;
        
        Scanner cy = new Scanner(System.in);
        System.out.println("Enter the radius of a cyclinder");
        radius = cy.nextInt();
        System.out.println("Enter the height of a cyclinder");
        height = cy.nextInt();
        
        VolCy = (PI * height * height * radius);
        System.out.println("The Volume of cylinder is : " + VolCy);
    }
    
}
