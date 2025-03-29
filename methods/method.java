package methods;

public class method {
	
	// void method
	public void  Hello() {
		System.out.println("hello");
	}
	
	//static method
	public static int add(int a, int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}  
	public static void main(String[] args) {
		method x= new method();
		x.Hello();
		
		x.add(1,20);
	}
}
