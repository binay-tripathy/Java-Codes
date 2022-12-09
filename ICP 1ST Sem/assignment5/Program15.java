package assignment5;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an amount : ");
		double amount = sc.nextDouble();
		System.out.print("Enter the annual interest rate : ");
		double rate = sc.nextDouble();
		double r = rate/1200;
		System.out.print("Enter number of months : ");
		int months = sc.nextInt();
		
		double am = 1, ca =	amount;
		for(int i=1; i<=months; i++) {
			am = ca*(1 + r);
			ca = amount + am;
		}
		System.out.println("The amount after " + months + " months is: " + am);
		
		sc.close();
		
	}

}
