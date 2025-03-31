package access_modifier;

public class protectedAccesss {
	int y=100;
	protected String s2 ="omkar";
	public String s1="hello";
	protected void kk() {
		System.out.println("protected kk method");
	}
	
	public static void main(String[] args) {
		protectedAccesss obj= new protectedAccesss();
		obj.kk();
	}
}
