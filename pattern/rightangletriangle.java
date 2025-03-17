package pattern;

public class rightangletriangle {
	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=5; i>0; i--) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {					
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();

		for(char i=69; i>=65; i--) {
			for(char j=65; j<=69; j++) {
				if(j>=i) {					
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
