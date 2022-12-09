package assignment3;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a, b and c : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double d = (b*b)-4*a*c;
		if(d > 0) {
			double r1 = (-b + Math.sqrt(d))/2*a;
			double r2 = (-b - Math.sqrt(d))/2*a;
			System.out.println("The equation has two roots " + r1 +" and " + r2);
		}
		else if (d == 0) {
			double r1 = (-b)/2*a;
			System.out.println("The equation has one root " + r1 );
		}
		else {
			System.out.println("The equation has no real roots");
		}
		
		sc.close();
	}

}
