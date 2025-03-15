package logicHWNumbers;

import java.util.Scanner;

public class electricBill {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ennter the unit");
		int unit= sc.nextInt();
		
		int charge;
		int metercharge;
		if(unit >0 && unit<=100) {
			charge=100;
			metercharge=150;
		}else if (unit>101 && unit <=200) {
			charge=150;
			metercharge=200;
		}else if (unit>201 && unit <=300) {
			charge=200;
			metercharge=250;
		}
		else {
			charge=250;
			metercharge=300;
		}
		
		int bill=metercharge+(unit*charge);
		System.out.println("Ener unit bill is = "+bill);
	}
}
