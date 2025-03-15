package logicHWNumbers;

import java.util.Scanner;

public class printnumnotdiv5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting point");
		int a=sc.nextInt();
		
		System.out.println("Enter the ending point");
		int b= sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			if(i%5 !=0) {
				System.out.println(i);
			}
		}
	}
}
