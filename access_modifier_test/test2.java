package access_modifier_test;

import access_modifier.protectedAccesss;

public class test2 extends protectedAccesss {
	
	public void hh() {
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		test2 obj= new test2();
		obj.hh();
		
		obj.kk();
	}
}
