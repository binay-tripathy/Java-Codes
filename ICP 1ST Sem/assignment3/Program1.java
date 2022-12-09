package assignment3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height of the person in feet : ");
		int h = sc.nextInt();
		if (h>=6) {
			System.out.println("The person is tall.");
		}
		sc.close();
	}

}
