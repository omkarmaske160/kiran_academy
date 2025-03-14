package logicHwProgram;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class printNumberSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int a= sc.nextInt();
		
		System.out.println("Enter Ending Number");
		int b= sc.nextInt();
		
		if(a<b) {
			for(int i=a; i<=b; i++) {
				System.out.println(i);
			}
		}else {
			for(int i=a; i>=b; i--) {
				System.out.println(i);
			}
		}
		
	}
}
