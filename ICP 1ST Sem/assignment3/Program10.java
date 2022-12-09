package assignment3;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter today's day: ");
		int x = sc.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int y = sc.nextInt();
		
		int z = (x+y)%7;
		
		System.out.print("Today is ");
		switch (x) {
		case (0):System.out.print("Sunday"); break;
		case (1):System.out.print("Monday");break;
		case (2):System.out.print("Tuesday"); break;
		case (3):System.out.print("Wednesday"); break;
		case (4):System.out.print("Thursday"); break;
		case (5):System.out.print("Friday"); break;
		case (6):System.out.print("Saturday"); break;
		}
		
		System.out.print(" and the future day is ");
		switch (z) {
		case (0):System.out.print("Sunday");break;
		case (1):System.out.print("Monday"); break;
		case (2):System.out.print("Tuesday"); break;
		case (3):System.out.print("Wednesday"); break;
		case (4):System.out.print("Thursday"); break;
		case (5):System.out.print("Friday"); break;
		case (6):System.out.print("Saturday"); break;
		}
		
		sc.close();

	}

}
