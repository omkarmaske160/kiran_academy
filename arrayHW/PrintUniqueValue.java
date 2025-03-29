package arrayHW;

import java.util.Scanner;

public class PrintUniqueValue {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int arr[]= new int[5];
		
		System.out.println("Enter the value of an array");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		PrintUniqueValue obj= new PrintUniqueValue();
		obj.uniqueValue(arr);
	}
	public void uniqueValue(int arr[]) {
		int x=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==arr[i]) {
					x++;
				}
			}
			if(x==1) {
				System.out.println("Unique value = "+ arr[i]);
			}
			x=0;
		}
	}
}
