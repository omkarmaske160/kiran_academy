package arrayHW;

import java.util.Scanner;

public class oddNoSquare {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of an Array");
		int arr[]= new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		oddNoSquare obj= new oddNoSquare();
		obj.print(arr);
		
	}
	
	
	public void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 !=0) {
				System.out.println(arr[i]*arr[i]);
			}
		}
	}
}
