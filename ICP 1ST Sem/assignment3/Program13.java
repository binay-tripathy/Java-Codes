package assignment3;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month and year : ");
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		boolean ly = (y%4==0 && y%100!=0) || (y%400==0);
		switch(m) {
		case 1:System.out.println("January "+ y + " had 31 days.");break;
		case 2:
			if(ly)	System.out.println("February "+ y + " had 29 days.");
			else	System.out.println("February "+ y + " had 28 days.");
			break;
		case 3:System.out.println("March "+ y + " had 31 days.");break;
		case 4:System.out.println("April "+ y + " had 30 days.");break;
		case 5:System.out.println("May "+ y + " had 31 days.");break;
		case 6:System.out.println("June "+ y + " had 30 days.");break;
		case 7:System.out.println("July "+ y + " had 31 days.");break;
		case 8:System.out.println("August "+ y + " had 31 days.");break;
		case 9:System.out.println("September "+ y + " had 30 days.");break;
		case 10:System.out.println("October "+ y + " had 31 days.");break;
		case 11:System.out.println("November "+ y + " had 30 days.");break;
		case 12:System.out.println("December "+ y + " had 31 days.");break;
		}
		
		sc.close();
	}
}