package assignment3;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x and y coordinates : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if ((x == 0) && (y == 0)) {
			System.out.println("("+ x + ", " + y + ") is on the origin");
		}
		else if (x == 0) {
			System.out.println("("+ x + ", " + y + ") is on the X axis");
		}
		else if (y == 0) {
			System.out.println("("+ x + ", " + y + ") is on the Y axis");
		}
		else if (x>0 && y>0) {
			System.out.println("("+ x + ", " + y + ") is in quadrant I");
		}
		else if (x<0 && y>0) {
			System.out.println("("+ x + ", " + y + ") is in quadrant II");
		}
		else if (x<0 && y<0) {
			System.out.println("("+ x + ", " + y + ") is in quadrant III");
		}
		else if (x>0 && y<0) {
			System.out.println("("+ x + ", " + y + ") is in quadrant IV");
		}
		
		sc.close();
	}

}
