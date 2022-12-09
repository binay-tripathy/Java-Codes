package assignment5;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		String s="";
		while(n>0){
			int t=n%2;
			n/=2;
			s=t+s;
		}
		System.out.println(s);
		
		sc.close();
		
	}

}
