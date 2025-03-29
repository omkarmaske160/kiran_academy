package arrayHW;

import java.util.Scanner;

public class squareOfArrayElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int arr[]= new int[5];
		System.out.println("Enter the value of Array element");
		
		for(int i=0; i<5; i++) {
			arr[i]= sc.nextInt();
		}
		
		squareOfArrayElement obj= new squareOfArrayElement();
		obj.print(arr);

	
	}
	
	public void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]*arr[i]);
		}
	}
}
