package assignment3;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a<b && a<c) {
			if (b<c) {
				System.out.println(a + " " + b + " " + c);
			}
			else if (c<b) {
				System.out.println(a + " " + c + " " + b);
			}
		}
		else if(b<a && b<c) {
			if (a<c) {
				System.out.println(b + " " + a + " " + c);
			}
			else if (c<a) {
				System.out.println(b + " " + c + " " + a);
			}
		}
		else {
			if (a<b) {
				System.out.println(c + " " + a + " " + b);
			}
			else if (b<a) {
				System.out.println(c + " " + b + " " + a);
			}
		}
		
		sc.close();
	}

}
