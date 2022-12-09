package assignment4;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count from : ");
		int a = sc.nextInt();
		System.out.print("Count to : ");
		int b = sc.nextInt();
		System.out.print("Count by : ");
		int c = sc.nextInt();
		sc.close();
		
		for (; a<=b ; a+=c) {
			System.out.print(a + " ");
		}
		
		
	}
	
}