package assignment5;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n = sc.nextInt();
		int f = 2;
		while(n>1) {
			if(n%f==0) {
				System.out.print(f+", ");
				n/=f;
			}
			else {
				f++;
			}
		}
		
		sc.close();
		
	}

}
