package assignment3;

import java.util.Scanner;

class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String s){
		super (s);
	}
}

class Student{
	String name;
	double mark;
	Student(String name, double mark) {
//		super();
		this.name = name;
		this.mark = mark;
	}
	void display() {
		System.out.println(name + " has scored " + mark + " marks.");
	}
	
}

public class A3Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of Student : ");
		String name = sc.next();
//		while(true) {
//			int flag = 0;
			System.out.print("Enter the mark : ");
			
			
			try {
				double mark = sc.nextDouble();
				sc.close();
				if (mark>100)
					throw new MarksOutOfBoundException("Mark is greater than 100");
				else {
					Student s = new Student(name, mark);
					s.display();
//					flag = 1;
				}
			}
			catch(MarksOutOfBoundException ex) {
				System.out.println(ex.getMessage());
			}
//			if (flag == 1)
//				break;
//		}
		
	}

}
