package access_modifier;

public class demo {
	public static void main(String[] args) {
		PrivateAccess obj= new PrivateAccess();
		obj.m1();
		System.out.println(obj.y);
		
		privateAccessModifier x = new privateAccessModifier();
		//System.out.println(x.s1); 
		//not accessable because of private key workd
		
		x.m1();
		//m1 can access due to public keyword
		
		protectedAccesss y= new protectedAccesss();
		y.kk();
	}
}
