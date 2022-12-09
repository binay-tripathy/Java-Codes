package assignment3;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		boolean x = ((n%5 == 0) && (n%6 == 0));
		boolean y = ((n%5 == 0) || (n%6 == 0));
		boolean z = ((n%5 == 0) ^ (n%6 == 0));
		
		System.out.println("Is " + n + " divisible by 5 and 6? " + x);
		System.out.println("Is " + n + " divisible by 5 or 6? " + y);
		System.out.println("Is " + n + " divisible by 5 or 6, but not both? " + z);
		
		sc.close();

	}

}
