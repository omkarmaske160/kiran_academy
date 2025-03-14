package praticalloop;

import java.util.Scanner;

public class cubeofdigit {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int y= sc.nextInt();

		int n;
		
		while(y>0) {
			n=y%10;
			y=y/10;
			System.out.println(n*n*n);
		}
}
}
