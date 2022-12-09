package assignment2;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of hexagon :");
		double side = sc.nextDouble();
		double area = ((3*1.732) * side * side ) / 2;
		System.out.println("The area of the hexagon is "+ area);
		
		sc.close();

	}

}
