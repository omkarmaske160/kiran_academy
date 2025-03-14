package praticalloop;

public class x {
public static void main(String[] args) {
	int y=5486;
	int n;
	String reverse="";
	
	while(y>0) {
		n=y%10;
		y=y/10;
		reverse+=n;
	}
	System.out.println(reverse);
}
}
