package assignment3;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int n = sc.nextInt();
		int x = (int)(Math.random()*3);
		System.out.print("You have given : ");
		switch (n) {
		case 0:System.out.println("scissor");break;
		case 1:System.out.println("rock");break;
		case 2:System.out.println("paper");break;
		}
		
		System.out.print("The computer is : ");
		switch (x) {
		case 0:System.out.println("scissor");break;
		case 1:System.out.println("rock");break;
		case 2:System.out.println("paper");break;	
		}
		
		boolean win = (n==0 && x==2) || (n==1 && x==0) || (n==2 && x==1);
		if (win) System.out.println("You won");
		else {
			if (n == x)	System.out.println("Its a Draw.");
			else System.out.println("You lose");
		}
		
		sc.close();
	}

}
