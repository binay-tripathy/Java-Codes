package assignment3;

import java.util.Scanner;

public class A3Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int flag = 0;
			System.out.print("Enter your lucky number : ");
			int n = sc.nextInt();
			try {
				if (n<0)
					throw new NumberFormatException("Do enter a non negative number.");
				flag = 1;
			}
			catch(NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
			if (flag==1)
				break;
		}
		sc.close();
	}

}
