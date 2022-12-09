package assignment2;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting velocity in m/s : ");
		double v0 = sc.nextDouble();
		System.out.println("Enter the ending velocity in m/s : ");
		double v1 = sc.nextDouble();
		System.out.println("Enter the time span in sec : ");
		double t = sc.nextDouble();
		double a = (v1 - v0)/t;
		System.out.println("The average acceleration is " + a );
		
		sc.close();
				
	}

}
