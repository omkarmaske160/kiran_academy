package logicHWNumbers;

import java.util.Scanner;

public class mindigitinNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int number= sc.nextInt();
	int min=99;
	int y;
	while(number>0) {
		y=number%10;
		if(min>y) {
			min=y;
		}
		number /=10;
	}
	System.out.println("Min number is "+min);
}
}
