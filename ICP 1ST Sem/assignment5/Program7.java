package assignment5;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		int sum = 0, k=1;
		
		for(int i=1; i<=n; i++) {
			sum = sum+(int)Math.pow(-1, i-1)*k;
			k = k+2;
		}
		System.out.println("Sum upto n terms:"+sum);

		sc.close();
		
	}

}
