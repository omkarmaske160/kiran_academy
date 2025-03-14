package praticalloop;

import java.util.Scanner;

public class printfactorialNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	int y= sc.nextInt();
	
	
	int fact=1;
	for(int i=1; i<=y; i++) {
		fact*=i;
	}
	System.out.println("factorial of value "+y+" = "+ fact);
}
}
