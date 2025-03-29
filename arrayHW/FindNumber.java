package arrayHW;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int arr[]= new int [5];
		System.out.println("Enter the Value of Array");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("enter the finding element");
		int find= sc.nextInt();
		FindNumber obj= new FindNumber();
		obj.print(arr, find);
	}
	
	public void print(int arr[], int find) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==find) {
				System.out.println(i);
			}
			
		}
	}
}
