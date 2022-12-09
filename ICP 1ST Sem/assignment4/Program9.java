package assignment4;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no 'N' : ");
		int n = sc.nextInt();
		int i=0, j=1;
		while(j <= n){
			i = j;
			j *= 2;
		}
		System.out.println("The nearest largest power of two is : " + i);
		
		sc.close();
	}

}
