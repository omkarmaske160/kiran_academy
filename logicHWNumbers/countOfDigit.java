package logicHWNumbers;

import java.util.Scanner;

public class countOfDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		
		int y;
		int count=0;
		while(a>0) {
			y=a%10;
			a=a/10;
			count++;
		}
		System.out.println(count);
	}
}
