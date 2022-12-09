package assignment5;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x and n : ");
		int x = sc.nextInt();
		int n = sc.nextInt();
		long fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		
		double ans = Math.pow(x, n)/fact;
		System.out.println("Answer is : " + ans);

		sc.close();
		
	}

}
