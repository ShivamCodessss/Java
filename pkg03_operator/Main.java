package pkg03_operator;

public class Main {

    public static void main(String[] args) {
        //Arithmetic Operators
        int num1 = 10, num2 = 2;
        float num3 = 10.25f, num4 = 3.75f;
        System.out.println("Num1 is : " + num1);
        System.out.println("Num2 is : " + num2);
        System.out.println("Num3 is : " + num3);
        System.out.println("Num4 is : " + num4);
        
        
        System.out.println("Num1 + Num2 = " + (num1 + num2) );
        System.out.println("Num1 - Num2 = " + (num1 - num2) );
        System.out.println("Num1 * Num2 = " + (num1 * num2) );
        System.out.println("Num1 / Num2 = " + (num1 / num2) );
        System.out.println("Num1 % Num2 = " + (num1 % num2) );

        
        /*Logical Operators
        Logical Opreators are used for decision Making.
        1. AND  (A && B) if both the balue is true then the end value is  ture
        2. OR   (A || B) if any of the value is true then the end value is true
        3. NOT  !(A && B) it is used to reverse the table
        */

        
        int a = 10, b = 20, c = 30, d = 0;
        //displaying the values 
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);
        
        //using logical and
        if ((a < b ) && (b == c))
        {
            d = a + b + c;
            System.out.println(" The sum is : " + d);
        }
        else
        {
            System.out.println("False Condition");
        }
        
        
        //Relational Operator
        /*
        used to compare different sets of data.
        Evaluating whether the value of a variable is greater then or less then the value
        used in decison making 
        used in control the flow of program
        " == " Equals too
        " > " greater than
        " < " less than 
        " 1= " not equal too
        " >= " greater than equal too
        " <= " less than equal too
        */
    }
    
}
