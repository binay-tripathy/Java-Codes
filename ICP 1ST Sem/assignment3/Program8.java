package assignment3;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age of Rahul : ");
		int R = sc.nextInt();
		System.out.print("Enter the age of Ayush : ");
		int Ay = sc.nextInt();
		System.out.print("Enter the age of Ajay : ");
		int Aj = sc.nextInt();
		
		if (R > Ay && R > Aj) {
			System.out.println("Rahul is the eldest.");
		}
		else if(Ay > Aj) {
			System.out.println("Ayush is the eldest.");
		}
		else {
			System.out.println("Ajay is the eldest.");
		}
		
		sc.close();
	}

}
