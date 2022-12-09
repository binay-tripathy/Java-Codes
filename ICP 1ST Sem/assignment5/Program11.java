package assignment5;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		int n = sc.nextInt();
		
		if(n<=0) {
			System.out.println("Program terminated. Please enter value greater than 0.");
		}
		else {
			System.out.print("Enter value of x : ");
			double x = sc.nextDouble();
			x = Math.toRadians(x);
			double sum = 1, upper = 1, lower = 1, k = 1, curr_val;
			for(int i=2; i<=n; i++) {
				upper = upper*(-x*x);
				lower = lower*k*(k+1);
				k = k+2;
				curr_val = upper/lower;
				sum += curr_val;
			}
			System.out.println("Sum of cos(x) series upto " + n + " terms : "+sum);
		}
		
		sc.close();

	}

}
