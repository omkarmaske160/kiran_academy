package logicHWNumbers;

import java.util.Scanner;

public class maxdigit {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= sc.nextInt();
		int y;
		int larget=0;
			while(a>0) {
			y=a%10;
			a=a/10;
			if(y>larget) {
				larget=y;
			}
		}
			System.out.println("largest Digit is "+larget);
	}
}
