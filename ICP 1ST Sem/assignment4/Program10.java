package assignment4;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number 'N' : ");
		int n = sc.nextInt();
		
		int i = 1;
		while (i<=n) {
			int j = 1;
			while (j<=i) {
				System.out.print("* ");
				j++;
			 }
			 i++; 
			 System.out.println();
		}
		
//		for (int i = 1; i<=n; i++) {
//			for (int j = 1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		sc.close();
	}

}
