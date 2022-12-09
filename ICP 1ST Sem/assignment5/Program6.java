package assignment5;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int sum = 0;
		
		System.out.print("Enter " + n + " numbers : ");
		
		for(int i=1; i<=n; i++) {
			int a = sc.nextInt();
			sum += (1.0/a);
		}
		System.out.println("Harmonic mean is:"+(n/sum));
		
		sc.close();

	}

}
