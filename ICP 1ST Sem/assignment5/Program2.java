package assignment5;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int students = sc.nextInt();
		
		int passed = 0;
		
		for(int i=1; i<=students; i++) {
			System.out.print("Enter marks of student " + i + " : ");
			int marks = sc.nextInt();
			if(marks>=40) {
				passed++;
			}
		}
		System.out.println("Total passed students: " + passed);
		
		sc.close();

	}

}
