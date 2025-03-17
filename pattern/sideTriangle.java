package pattern;

public class sideTriangle {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				
					System.out.print("* ");
			
			}
			System.out.println();
		}
		System.out.println();

		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				
					System.out.print(j +" ");
			
			}
			System.out.println();
		}
		
		System.out.println();

		
		for(char i=65; i<=69; i++) {
			for(char j=65; j<=i; j++) {
				
					System.out.print(j +" ");
			
			}
			System.out.println();
		}
	}
	
	
}
