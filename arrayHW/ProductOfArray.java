package arrayHW;

import java.util.Scanner;

public class ProductOfArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of an array");
		
		int arr[]= new int [5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		ProductOfArray obj = new ProductOfArray();
		obj.print(arr);
		
	}
	public void print(int arr[]) {
		int product=1;
		for(int i=0; i<arr.length; i++) {
			product*= arr[i];
		}
		
		System.out.println("Product of Array= "+ product);
	}
}
