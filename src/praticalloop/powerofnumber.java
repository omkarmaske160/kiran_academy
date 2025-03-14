package praticalloop;

import java.util.Scanner;

public class powerofnumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Base");
	int base= sc.nextInt();	
	
	System.out.println("Enter power");
	int power= sc.nextInt();	
	
	
	int x=base;
	for(int i=1; i<=power; i++) {
		x*=base;
	}
	System.out.println(x);
}
}
