package praticalloop;

public class palindromeNumber {
public static void main(String[] args) {
	int y=5115;
	int n;
	int r=0;
int copy=y;
	
	while(y>0) {
		n=y%10;
		y=y/10;
		r=(r*10)+n;
	}
	if(copy==r) {
		System.out.println(r +" is palindrome number");
	}else {
		System.out.println(r +"  is not palindrome number");
	}
	
}
}
