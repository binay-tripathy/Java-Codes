package assignment3;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("What is your gender (M or F): ");
		char g = sc.next().charAt(0);
		System.out.print("First Name: ");String f = sc.next();
		System.out.print("Last Name: ");String l = sc.next();
		System.out.print("Age: ");int a = sc.nextInt();
		System.out.print("Are you married, " + f + " (y or n)?: ");
		char m = sc.next().charAt(0);
		
		if (g == 'F') {
			if (a>20) {
				if (m == 'y') 
					System.out.println("Then I shall call you Mrs. " + f + " " + l);
				else if (m == 'n')
					System.out.println("Then I shall call you Ms. " + f);
			}
			else if (a<20)
				System.out.println("Then I shall call you " + f + " " + l);
		}
		else if(g == 'M') {
			if (a>20)
				System.out.println("Then I shall call you Mr. " + f);
			else if (a<20)
				System.out.println("Then I shall call you " + f + " " + l);
		}
		
		sc.close();
		
	}

}
