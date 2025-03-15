package logicHWNumbers;

import java.util.Scanner;

public class employeeSalery {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		int a=sc.nextInt();
		
		int da=(8*a)/100;
		int hra=(15*a)/100;
		int tra=(5*a)/100;
		int pt=(10*a)/100; 
		int pf=(12*a)/100;
		
		int gross_salary= a+da+hra+tra;
		int net_salary= gross_salary-(pt+pf);
		
		System.out.println("Gross Salary = "+ gross_salary);
		System.out.println("Net Salary = "+ net_salary);
	}
}
