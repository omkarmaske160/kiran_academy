package looping;

public class printProducteven1to10 {
public static void main(String[] args) {
	int product=1;
	for(int i=1; i<=10; i++) {
		if(i%2==0) {
			product *=i;
		}
	}
	System.out.println(product);
}
}
