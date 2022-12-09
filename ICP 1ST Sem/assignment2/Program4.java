package assignment2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000 : ");
		int num = sc.nextInt();
		int temp = 0;
		temp += num%10;
		num/=10;
		temp += num%10;
		num/=10;
		temp += num%10;
		num/=10;
		System.out.println("The sum of the digits is : " +  temp);
		
		sc.close();
	}

}
