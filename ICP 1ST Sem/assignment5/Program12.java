package assignment5;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int n = sc.nextInt();
		System.out.print("Enter value of x : ");
		double x = sc.nextDouble();
		double sum = 0, lower = 1, curr_val;
		for(int i=0; i<n; i++) {
			if(i==0) {
				lower = 1;
			}
			else {
				lower = lower*i;
			}
			curr_val = Math.pow(x, i)/lower;
			sum = sum+curr_val;
		}
		System.out.println("Expansion of taylor series upto " + n + " terms: " + sum);

		sc.close();
		
	}

}
