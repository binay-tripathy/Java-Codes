package assignment2;

import java.util.Scanner;

class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class Student1 extends Person{
	String course;
	int roll;
	double marks;
	Scanner sc = new Scanner(System.in);
	Student1(String name, int age){
		super(name, age);
	} 
	void setDetails() {
		System.out.print("Enter the course : ");
		course = sc.next();
		System.out.print("Enter the roll no : ");
		roll = sc.nextInt();
		System.out.print("Enter the marks : ");
		marks = sc.nextDouble();
	}
	void display() {
		System.out.println(name + " of age " + age + " and roll no. " + roll + " has enrolled in the course of " + course + " and secured " + marks + " marks.");
	}
}
class Teacher extends Person{
	String subject_assigned;
	double contact_hour;
	Scanner sc = new Scanner(System.in);
	Teacher(String name, int age){
		super(name, age);
	} 
	void setDetails() {
		System.out.print("Enter the subject assigned to the teacher : ");
		subject_assigned = sc.next();
		System.out.print("Enter the teacher contact hour : ");
		contact_hour = sc.nextDouble();
	}
	void display() {
		System.out.println(name + " of age " + age + " teaches the subject " + subject_assigned + " and the teacher's contact hour is " + contact_hour);
	}
}
public class A2Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to enter data for student or teacher : ");
		String data = sc.next();
		System.out.print("Enter name : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		if (data.equals("student")) {
			Student1 s = new Student1(name, age);
			s.setDetails();
			s.display();
		}
		else if (data.equals("teacher")) {
			Teacher t = new Teacher(name, age);
			t.setDetails();
			t.display();
		}
		sc.close();

	}

}
