package assignment2;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 : ");
		double x1 = sc.nextDouble();
		System.out.print("Enter y1 : ");
		double y1 = sc.nextDouble();
		System.out.print("Enter x2 : ");
		double x2 = sc.nextDouble();
		System.out.print("Enter y2 : ");
		double y2 = sc.nextDouble();
		System.out.print("Enter x3 : ");
		double x3 = sc.nextDouble();
		System.out.print("Enter y3 : ");
		double y3 = sc.nextDouble();
		
		double a1 = x2 - x1;
		double b1 = y2 - y1;
		double c1 = Math.pow(a1, 2)+ Math.pow(b1, 2);
		double side1 = Math.sqrt(c1);
		
		double a2 = x3 - x2;
		double b2 = y3 - y2;
		double c2 = Math.pow(a2, 2)+ Math.pow(b2, 2);
		double side2 = Math.sqrt(c2);
		
		double a3 = x1 - x3;
		double b3 = y1 - y3;
		double c3 = Math.pow(a3, 2)+ Math.pow(b3, 2);
		double side3 = Math.sqrt(c3);
		
		double s = (side1 + side2 + side3)/2;
		
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println("The area of the triangle is : " + area);
		
		sc.close();
	}

}
