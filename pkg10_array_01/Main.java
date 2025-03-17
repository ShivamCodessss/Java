package pkg10_array_01;


public class Main {
        // creating an array which recives an array as a parameter
      static void printArray(int arr[])
        {
            for (int i = 0; i<arr.length; i++)
            {
                System.out.println(arr[i]);
            }
            
        }
    public static void main(String[] args) {
//            int a[] = {33,44,4,2};
//            //printing array
//            for(int i = 0; i<a.length;i++)
//            {
//                System.out.println(a[i]);

        //discuss error 
//            int a[] = {33,44,4,2};
//                //printing array
//            for(int i = 0; i<=a.length;i++)
//            {
//                System.out.println(a[i]);
//            }

        // printing using for-each loop
        
//        int arr[] = {33,44,23,3};
//        for (int i:arr)
//            System.out.println(i);

        // anonymous array
        printArray(new int[]{22,33,44,1,23});
   }
    
}
