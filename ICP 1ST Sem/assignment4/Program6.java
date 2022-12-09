package assignment4;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for which you want to find the multiplication table : ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
		
		sc.close();
	}

}
