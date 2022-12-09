package assignment5;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		long fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of " + n + " is : " + fact);

		sc.close();
		
	}

}
