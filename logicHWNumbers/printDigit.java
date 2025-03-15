package logicHWNumbers;

import java.util.Scanner;

public class printDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		
		int y;
		for(int i=0; i<=a; i++) {
			y=a%10;
			a=a/10;
			System.out.println(y);
		}
		
	}
}
