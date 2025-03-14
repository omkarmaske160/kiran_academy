package praticalloop;

public class printodd25to5 {
public static void main(String[] args) {
	int product=1;
	for(int i=25; i>=5; i--) {
		if(i%2==1) {
product*=i;
		}
	}
	System.out.println(product);
}
}
