package assignment4;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check its divisiblity by 9 : ");
		int n = sc.nextInt();
		
		int temp = n, sum = 0;
		while (n>0) {
			sum += n%10;
			n /= 10;
		}
		
		if (sum%9 == 0) {
			System.out.println(temp + " is divisible by 9");
		}
		else{
			System.out.println(temp + " is not divisible by 9");
		}
		
		sc.close();
		
	}

}
