package assignment2;

import java.util.Scanner;

class Student{
	String name, course;
	int roll;
	Scanner sc = new Scanner(System.in);
	void input_Student(){
		System.out.print("Enter the name : ");
		name = sc.next();
		System.out.print("Enter roll number of the student : ");
		roll = sc.nextInt();
		System.out.print("Enter the course enrolled by the student : ");
		course = sc.next();
	}
	void display_Student(){
		System.out.println(name  + " of roll no. " + roll + " has enrolled in the course of " + course);
	}
}
class Exam extends Student{
	double mark1, mark2, mark3;
	Scanner sc = new Scanner(System.in);
	void input_Marks() {
		System.out.print("Enter the marks of three subjects : ");
		mark1 = sc.nextDouble();
		mark2 = sc.nextDouble();
		mark3 = sc.nextDouble();
	}
	void display_Result() {
		System.out.println("The result of " + name + " is " + ((mark1 + mark2 + mark3)/3) + "%");
	}
}

public class A2Q3 {

	public static void main(String[] args) {
		Exam s[] = new Exam[5];
		for (int i = 0; i<5; i++) {
			s[i] = new Exam();
			s[i].input_Student();
			s[i].input_Marks();
			s[i].display_Student();
			s[i].display_Result();
		}
	}

}
