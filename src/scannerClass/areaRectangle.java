package scannerClass;

import java.util.Scanner;

public class areaRectangle {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter length");
	float l= sc.nextFloat();
	
	System.out.println("Enter width");
	float w= sc.nextFloat();
	System.out.println("Area of Reactangle :: "+ (l*w));
}
}
