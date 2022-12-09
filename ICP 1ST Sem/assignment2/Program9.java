package assignment2;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 : ");
		double x1 = sc.nextDouble(); 
		System.out.println("Enter y1 : ");
		double y1 = sc.nextDouble();
		System.out.println("Enter x2 : ");
		double x2 = sc.nextDouble();
		System.out.println("Enter y2 : ");
		double y2 = sc.nextDouble();
		double dist = ((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2-y1));
		System.out.println("The distance between the two points is "+ Math.sqrt(dist));
		
		sc.close();
	}

}
