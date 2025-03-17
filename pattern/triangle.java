package pattern;

public class triangle {
	public static void main(String[] args) {
		
		int sp=5;
		for(int i=0; i<5; i++) {
			for(int k=1; k<=(sp-i); k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {				
					System.out.print("* ");
			
			}
			System.out.println();
		}
	}
}
