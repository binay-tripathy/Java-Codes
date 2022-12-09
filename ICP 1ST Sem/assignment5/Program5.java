package assignment5;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		System.out.print("Enter numbers:");
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		
		System.out.println("Sum of entered numbers is:"+sum);
		System.out.println("Average of numbers is:"+(1.0 * sum/n));
		
		sc.close();

	}

}
