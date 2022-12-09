package assignment5;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int c=0, a=1;
		while(n>=a) {
			if(n%a==0) {
				c++;
			}
			a++;
		}
		if(c==2) {
			System.out.println(n + " is a Prime Number ");
		}
		else {
			System.out.println(n + " is a Non Prime Number ");
		}
		
		sc.close();

	}

}
