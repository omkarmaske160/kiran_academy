package access_modifier;

public class privateAccessModifier {
	
	int y=100;
	private String s1="Omkar";
	
	void m1() {
		System.out.println("hello");
	}
	
	private void k1() {
		System.out.println("private hello");
	}
	
	
	public static void main(String[] args) {
		privateAccessModifier obj= new privateAccessModifier ();
		System.out.println(obj.s1); // within the class can access
	}
}
