package scannerClass;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any integer value");
		int y= sc.nextInt();
		System.out.println(y);
		
		System.out.println("Enter any short integer value");
		int y1=sc.nextShort();
		System.out.println(y1);
		
		System.out.println("Enter any long integer value");
		long y2=sc.nextLong();
		System.out.println(y2);
		
		System.out.println("Enter any floot value");
		float y4=sc.nextFloat();
		System.out.println(y4);
		
		System.out.println("Enter any double  value");
		double y5=sc.nextDouble();
		System.out.println(y5);
		
		System.out.println("Enter any Char value");
		String y3=sc.next();
		System.out.println(y3);

		System.out.println("Enter any boolean value");
		Boolean y7=sc.nextBoolean();
		System.out.println(y7);
	}
}
