package A2Q9_1;

import java.util.Scanner;

public class Test extends Student {

	public double mark1, mark2;
	Scanner sc = new Scanner(System.in);
	public void input() {
		super.input();
		System.out.print("Enter the mark of 1st subject : ");
		mark1 = sc.nextDouble();
		System.out.print("Enter the mark of 2nd subject : ");
		mark2 = sc.nextDouble();
	}
	public void output() {
		System.out.println("The name of the student is " + name + " having roll no. " + roll + " has scored " + ((mark1 + mark2)/2) + "%");
	}
}


//width - 3ft    86cm
//height - 4ft 4in     132cm