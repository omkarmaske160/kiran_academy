package praticalloop;

public class printsqureodddigit {
public static void main(String[] args) {
	
	int y=135;
	int n;
	
	while(y>0) {
		n=y%10;
		y=y/10;
		if(n%2==1) {
			
		System.out.println(n*n*n);
		}
	}
}
}
