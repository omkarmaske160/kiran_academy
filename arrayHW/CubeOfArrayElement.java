package arrayHW;

import java.util.Scanner;

public class CubeOfArrayElement {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Element of Array");
		int arr[]= new int [5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		CubeOfArrayElement x= new CubeOfArrayElement();
		x.print(arr);
		
		
	}
	public void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]*arr[i]*arr[i]);
		}
	}
}
