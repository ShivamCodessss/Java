
package pkg09_array;

public class Main {

    public static void main(String[] args) {
        //single dimension array
        int a[] = new int[5];//declaration and initalizing 
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        
        //printing
        for (int i = 0; i<a.length; i++)// length is the property for array
        {
            System.out.println(a[i]);
        }

    }
    
}
