package array;

import java.util.Scanner;

public class ArraySysntax {
	
	//accept value form the user
	 public void acceptvalue(int arr[], int n) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the array value");
			for(int i=0; i<n; i++) {
				arr[i]= sc.nextInt();
			}
	 }
	 	
	 //display the value on screen
	 public void displayvalue(int arr[], int n) {
			System.out.println("value of array");
			for(int i=0; i<n; i++) {
				System.out.println(arr[i]);
			}
	 }
	 
	 public void reverseprint(int arr[], int n) {
		  System.out.println("Reverse array printing");
		  for(int i= n-1; i>=0; i--) {
			  System.out.println(arr[i]);
		  }
	 }
	 
	 //main function
	public static void main(String[] args) {
		int arr[]=new int [5]; //declaring array		
		int n= arr.length; // size of array method length 
		
		// creating object of the ArraySysntax  class
		ArraySysntax obj= new ArraySysntax();
		obj.acceptvalue(arr, n); // calling acceptvalue function
		obj.displayvalue(arr, n); // calling displayvalue function
		obj.reverseprint(arr, n); // calling reverseprint funcction
		
	}
}
