package assignment3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mark of the student : ");
		double m = sc.nextDouble();
		if (m>=40) {
			System.out.println("Congratulation! You have passed the exam.");
		}else {
			System.out.println("Sorry! You have failed the exam.");
		}
		
		sc.close();

	}

}
