package arrayHW;

import java.util.Scanner;

public class printPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];  
        System.out.println("Enter the values of the array:");
        
      
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printPrimeNumber obj = new printPrimeNumber();

        System.out.println("Prime Number are");
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (obj.print(x)) {
                System.out.println(x);
            } 
        }
    }

   
    public static boolean print(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;  
            }
        }
        return true;  
    }
}
