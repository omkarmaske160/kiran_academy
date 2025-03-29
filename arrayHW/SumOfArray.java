package arrayHW;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int arr[]= new int[5];
		System.out.println("Enter the value of an array");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		SumOfArray obj= new SumOfArray();
		obj.print(arr);
	}
	
	public void print(int arr[]) {
		int x=0;
		for(int i=0; i<arr.length; i++) {
			x+=arr[i];
		}
		System.out.println("Sum of Array = "+x);
				
	}
}
