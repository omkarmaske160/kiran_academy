package classAndObject;

import java.util.Scanner;

import scanner.scanner;

public class mathDemo {
	
	public void sum(int x, int b) {
		System.out.println("Addition"+ x+b);
	}
	
	public void sub(int x, int b) {
		System.out.println("subtration"+ (x-b));
	}
	
	public void multi(int x, int b) {
		System.out.println("multiplication"+x*b);
	}
	
	public void div(int x, int b) {
		System.out.println("division"+x/b);
	}
	
	public void mod(int x, int b) {
		System.out.println("mod"+x%b);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		
		System.out.println("Enter the number");
		int b= sc.nextInt();
		
		mathDemo a1= new mathDemo();
		a1.sum(a,b);
		a1.sub(a,b);
		a1.multi(a,b);
		a1.div(a,b);
		a1.mod(a,b);

	}
}
