package assignment5;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Program terminated. Please enter value greater than 0.");
		}
		else {
			System.out.print("Enter the value of x : ");
			double x = sc.nextDouble();
			x = Math.toRadians(x);
			double sum = x, upper = x, lower = 1, curr_val;
			int k = 1;
			for(int i=2; i<=n; i++) {
				upper = upper*(-x*x);
				lower = lower*(k+1)*(k+2);
				k += 3;
				curr_val = upper/lower;
				sum += curr_val;
			}
			System.out.println("Sum of the sin(x) series upto " + n + " terms : " + sum);
		}
		
		sc.close();

	}

}
