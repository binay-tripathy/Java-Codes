package assignment3;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the coordinates x and y : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double a = Math.sqrt(Math.pow((x-0),2)+ Math.pow((y-0),2));
		
		if (a<=10) {
			System.out.println("Point ("+ x + " , " + y + ") is in the circle");
		}
		else {
			System.out.println("Point ("+ x + " , " + y + ") is not in the circle");
		}
		
		sc.close();

	}

}
