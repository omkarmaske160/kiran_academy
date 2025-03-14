package praticalloop;

import java.util.Scanner;

public class numDivby7and4 {
public static void main(String[] args) {
	int x=0;
	for(int i=145; i<=451; i++) {
		if(i%4==0 && i%7==0) {
			x++;
		}
	}
	System.out.println(x);
	
	
}
}
 