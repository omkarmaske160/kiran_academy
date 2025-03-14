package praticalloop;

import java.util.Scanner;

public class productofDigit {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	int y= sc.nextInt();	
	
	//int y=5431;
	int n;
	int product=1;
	
	while(y>0) {
		
		n=y%10;
		y=y/10;
		product*=n;
		//product=product*n;
	}
	System.out.println(product);
}
}
