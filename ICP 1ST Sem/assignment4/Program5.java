package assignment4;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		int n = sc.nextInt();
		int sum = 0, product = 1;
		
		
		System.out.print("Sum of all even numbers = ");
		for (int i = 2; i<=n; i+=2) {
			sum += i;
			if (i<(n-1))	System.out.print(i + " + ");
			else	System.out.print(i);
		}
		System.out.println(" = " + sum);
		
		System.out.print("Product of all odd numbers = ");
		for (int j = 1; j<=n; j+=2) {
			product *= j;
			if (j<(n-1))	System.out.print(j + " * ");
			else 	System.out.print(j);
		}
		System.out.println(" = " + product);
		
		sc.close();

	}

}
