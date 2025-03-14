package javademo;

public class operator {
	public static void main(String []args) {
		int y1=4, y2=10;
		
		//ariethmatic operator
		System.out.println(y1+y2);
		System.out.println(y1-y2);
		System.out.println(y1*y2);
		System.out.println(y1/y2);
		System.out.println(y1%y2);
		
		String x2="omkar";
		String x3="omkar";
		String x1="makse";
		System.out.println(x1+x2);
		
		int y3=10;
		double s=20;
		double c=y3+s;
		System.out.println(c);
		
		//comparison operator
		System.out.println(y1>y2);
		System.out.println(y1<y2);
		System.out.println(y1>=y2);
		System.out.println(y1<=y2);
		System.out.println(y1==y2);
		System.out.println(y1!=y2);
		System.out.println(x2==x3);
		System.out.println(x2==x1);
		
		
		//logical operator
		System.out.println((y1<5) && (y1<7));
		System.out.println((y1<5) || (y1<7));
		System.out.println(!(y1<5) && (y1<7));
		
		
	}
}
