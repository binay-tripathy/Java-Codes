package assignment2;

import java.util.Scanner;

interface Person_Details1{
	void count(String name);
	void display();
}
class Count implements Person_Details1{
	String name;
	static  int maxcount;
	public void count(String name) {
		this.name = name;
		maxcount = name.length();		
	}

	public void display() {
		System.out.println(name + " has character count of " + maxcount);
	}
}
public class A2Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Count c = new Count();
		System.out.print("Enter a name : ");
		String name = sc.next();
		c.count(name);
		c.display();
		
		sc.close();
	}

}
