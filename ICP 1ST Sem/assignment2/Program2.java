package assignment2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder : ");
		double rad = sc.nextDouble();
		System.out.println("Enter the length of the cylinder : ");
		double len = sc.nextDouble();
		double area = rad * rad * 3.14;
		double volume = area * len;
		System.out.println("The area of the cylinder is "+ area);
		System.out.println("The volume of the cylinder is "+ volume);
		
		sc.close();

	}

}
