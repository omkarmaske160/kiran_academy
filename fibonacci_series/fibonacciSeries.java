package fibonacci_series;

public class fibonacciSeries {
	public static void main(String[] args) {
		
		int n1=0, n2=1, n3=0;
		System.out.println(n1 + " " + n2);
		for(int i=0; i<10; i++) {
		n3= n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		
		// this program is related to the for fibonacciSeries  
		}
	}
}
