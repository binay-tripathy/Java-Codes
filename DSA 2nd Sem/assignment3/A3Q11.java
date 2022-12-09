package assignment3;

import java.util.Scanner;

public class A3Q11 {
	
	static int gcd(int m, int n) {
		if (n==0)
			return m;
		else
			return gcd(n, m%n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int m = sc.nextInt();
		System.out.print("Enter second number : ");
		int n = sc.nextInt();
		System.out.println(gcd(m,n));

		sc.close();

	}

}
