package logicHwProgram;

import java.util.Scanner;

public class min3num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 number");
		int a=sc.nextInt();
		
		System.out.println("enter 2 number");
		int b=sc.nextInt();
		
		System.out.println("enter 3 number");
		int c=sc.nextInt();
		
		if(a<b && a<c) {
			System.out.println(a+" = number 1 is Lowest number");
		}
		 if(c<a && c<b) {
			System.out.println(c +" = number 3 is Lowest number");
		}
		 if(b<c && b<a) {
				System.out.println(b +" = number 2 is Lowest number");
		}
	}
}
