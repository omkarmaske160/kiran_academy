package praticalloop;

import java.util.Scanner;

public class primeorNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int number= sc.nextInt();	
	int count=0;
	
	for(int i=1; i<=number;i++) {
		if(number%i==0) {
			count++;
		}
	}
	if(count ==2) {
		System.out.println(number +" Number is Prime");
	}else {
		System.out.println(number +" Number is Not Prime");
	}
}
}
