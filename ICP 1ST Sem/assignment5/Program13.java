package assignment5;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Sorry...value of n should be greater than 0.");
		}
		else if(n==1) {
			System.out.println("The Fibonacci sequence is : 0");
		}
		else {
			System.out.print("The Fibonacci sequence is: 0, 1");
			int a = 0, b = 1, c;
			for(int i=1; i<=n-2; i++) {
				c = a+b;
				System.out.print(", "+c);
				a = b;
				b = c;
			}
		}
		
		sc.close();
		
	}

}
