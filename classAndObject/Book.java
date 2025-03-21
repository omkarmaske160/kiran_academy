package classAndObject;

import java.util.Scanner;



public class Book {
	
	public static void total(int quantity, int price) {
		double totalvalue=quantity*price;
		System.out.println(" Total =" + totalvalue);	
	}
	
	public static void properties(String name, int price, int quantity, String author, int page) {
		System.out.println("Book Name"+ name);
		System.out.println("Book price"+ price);
		System.out.println("Book quantity"+ quantity);
		System.out.println("Book author"+ author);
		System.out.println("Book page"+ page);

	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Book Name");
		String name= sc.next();
		
		System.out.println("Enter the Book price");
		int price= sc.nextInt();
		
		System.out.println("Enter the Book quantity");
		int quantity= sc.nextInt();
		
		System.out.println("Enter the Book author");
		String author= sc.next();
		
		System.out.println("Enter the Book pages");
		int page= sc.nextInt();
		
		Book a1= new Book();
		a1.properties(name, price, quantity, author, page);
		a1.total(quantity, price);
		
	}
}
