package Encapsulation;

public class bank {
	
	// bind data into the single entity this called encapsulation
	String name;
	private double balance;
	
	//get menthod
	public void setbalance(double b) {
		balance=b;
	}
	
	//set method
	public double getbalance() {
		return balance;
	}
}
