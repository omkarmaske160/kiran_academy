package praticalloop;

public class squareofechdigit {
public static void main(String[] args) {
	int y=5486;
	int n;
	
	while(y>0) {
		n=y%10;
		y=y/10;
		
		System.out.println(n*n);
	}
}
}
