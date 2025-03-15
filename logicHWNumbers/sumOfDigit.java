package logicHWNumbers;

import java.util.Scanner;

public class sumOfDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= sc.nextInt();
		int sum=0;
		int y;
		 for(int i=0; i<=a; i++){
			y=a%10;
			a=a/10;
			sum+=y;
		}
		System.out.println(sum);
	}
}
