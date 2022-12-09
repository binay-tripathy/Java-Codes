package assignment1;

class Student1{
	String name;
	int roll;
	double mark;
	
	void setData(String name, int roll, double mark) {
		this.name = name;
		this.roll = roll;
		this.mark = mark;
	}
	
	void display() {
		System.out.println(name + " of roll no " + roll + " has scored " + mark + " marks.");
	}
}

public class A1Q10 {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		s1.setData("Animesh", 55, 80.45);
		s2.setData("Arpitam", 19, 85.3);
		s3.setData("Binay", 26, 90.0);
		s1.display();
		s2.display();
		s3.display();
		
	}
}
