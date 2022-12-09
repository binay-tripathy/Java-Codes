package A2Q9_1;

import java.util.Scanner;

public class Student {
	String name;
	int roll;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.print("Enter the name of the Student : ");
		name = sc.next();
		System.out.print("Enter the roll no. : ");
		roll = sc.nextInt();
	}

}
