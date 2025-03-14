package logicHwProgram;

import java.util.Scanner;

public class bingoNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 number");
		int a=sc.nextInt();
		int y;
		int count=0;
		int b=a;
		
		if(a%7==0) {
			while(a>0) {
				y=a%10;
				a=a/10;
				if(y==7) {
					count++;
				}
			}
		}
		
		if(count ==0) {
			System.out.println(b+ " = is a BINGO number");
		}
		else {
			System.out.println(b+ " = is not a BINGO number");
		}
		
	}
}
