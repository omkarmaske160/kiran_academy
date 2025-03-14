package praticalloop;

public class sumofDigit {
	public static void main(String[] args) {
		int y=5413;
		int n;
		int sum=0;
		while(y>0) {
			
			n=y%10;
			y=y/10;
			sum+=n;
		}
		
		System.out.println(sum);
	}
}
