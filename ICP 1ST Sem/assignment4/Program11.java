package assignment4;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number 'N' : ");
		int n = sc.nextInt();
		int num = 1;
		
		
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
