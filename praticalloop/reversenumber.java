package praticalloop;

public class reversenumber {
	public static void main(String[] args) {
		int y=5486;
		int n;
		String reverse="";
		int r=0;
		
		while(y>0) {
			n=y%10;
			y=y/10;
			r=(r*10)+n;
			reverse+=n;
		}
		System.out.println(reverse);
		System.out.println(r);

	}
}
