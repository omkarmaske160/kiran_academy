package arrayHW;

import java.util.Scanner;

public class findDublicateValue {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int arr[]= new int [5];
		System.out.println("enter the value of array");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		findDublicateValue obj= new findDublicateValue();
		obj.findDublicate(arr);
	}
	
	public void findDublicate(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Dublicate value = "+ arr[i]);
				}
			}
		}
	}
}
