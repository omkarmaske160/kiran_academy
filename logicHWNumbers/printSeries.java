package logicHWNumbers;


public class printSeries {
public static void main(String[] args) {
	
	//number series
	//for(int i=1; i<=10; i++) {
		//System.out.println(i);
	//}
	
	//even number
	/*
	 * int b=2; for(int i=1; i<=10; i++) { if(b%2==0) { System.out.println(b); b+=2;
	 * }}
	*/
	
	//odd number
	/*
	 int c=1;
	 * for(int i=1; i<=10; i++) { if(c%2==1) { System.out.println(c); c+=2; } }
	 */
	
	//squer
	/*
	 * for(int i=1; i<11; i++) { System.out.println(i*i); }
	 */
	
	//cube
	/*
	 * for(int i=1; i<11; i++) { System.out.println(i*i*i); }
	 */
	
	//+- 
	/*
	 * for(int i=1; i<11; i++) { if(i%2==1) { System.out.println(i); } else {
	 * System.out.println(-i); } }
	 */
	
	//-+
	/*
	 * for(int i=1; i<11; i++) { if(i%2==0) { System.out.println(i); } else {
	 * System.out.println(-i); } }
	 */
	
	//odd number with + -
	/*
	 * int c=1; for(int i=1; i<11; i++) { if(c%2==1) { if(i%2==0) {
	 * System.out.println(-c); } else { System.out.println(c); } c+=2; } }
	 */
	
	//even number with  +-
	int b=2;
	for(int i=1; i<11; i++) {
		if(b%2==0) {
			if(i%2==0) {
				System.out.println(-b);
			}
			else {
				System.out.println(b);
			}
			b+=2;
		}
	}
	
	
}
}
