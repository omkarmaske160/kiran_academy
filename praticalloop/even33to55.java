package praticalloop;

public class even33to55 {
public static void main(String[] args) {
	int sum=0;
	for(int i=33; i<=55; i++) {
		if(i%2==0) {
			sum+=i;
		}
	}
	System.out.println(sum);
}
}
