package looping;

public class print101to145 {
public static void main(String[] args) {
	int i=101;
	while(i<=145) {
		if(i%4==0) {
			i++;
			continue;
		}
		System.out.println(i);
		i++;
	}
}
}
