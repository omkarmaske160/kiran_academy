package access_modifier_test;

import access_modifier.PrivateAccess;
import access_modifier.publicAccess;

public class test {
	
	
	
	public static void main(String[] args) {
		PrivateAccess obj= new PrivateAccess();
		//obj.m1(); not accessable in different package this public keyword
		//System.out.println(obj.y);
		
		publicAccess x= new publicAccess();
		System.out.println(x.kk); 
		// public class can be access any where just import it.
	}
}
