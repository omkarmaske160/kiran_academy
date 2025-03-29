package arrayHW;

import java.util.Scanner;

public class EvenInArray {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the value of Array");
		for(int i=0; i<5;i++) {
			arr[i]=sc.nextInt();
		}
		EvenInArray x= new EvenInArray();
		x.print(arr);
		
	}
	
	public void print(int arr[]) {
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}

	}
}
