package scannerClass;

import java.util.Scanner;

public class areaCircle {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter radius");
	float x1= sc.nextFloat();
	System.out.println("Area of Circle :: "+ (3.7*x1)*2);
	System.out.println("Circumference of Circle :: "+ (2*3.7*x1));
}
}
