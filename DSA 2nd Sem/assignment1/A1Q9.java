package assignment1;

import java.util.Scanner;

class Student{
	String name;
	int roll;
	double mark;
	Scanner sc = new Scanner(System.in);
	void setData() {
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter roll no. : ");
		roll = sc.nextInt();
		System.out.print("Enter mark : ");
		mark = sc.nextDouble();
	}
	
	void display() {
		System.out.println(name + " of roll no " + roll + " has scored " + mark + " marks.");
	}
}

class StudentDetails {
	 
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setData();
		s2.setData();
		s3.setData();
		s1.display();
		s2.display();
		s3.display();
		
	}

}
