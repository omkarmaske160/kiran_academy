package patternHW;

public class reverseSideAnagleTriangle {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int x=1;
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(x+" ");
				x++;
			}
			x=1;
			System.out.println();
			
		}
		
		System.out.println();
		
		for(char i=65; i<=69; i++) {
			for(char j=69; j>=i; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
