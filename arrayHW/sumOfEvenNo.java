package arrayHW;

import java.util.Scanner;

public class sumOfEvenNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int arr[]= new int [5];
		System.out.println("Enter the value of Array");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();		
		}
		sumOfEvenNo obj= new sumOfEvenNo();
		obj.print(arr);
		
	}
	public void print(int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("sum = "+sum);
	}
}
