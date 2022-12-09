package assignment2;

import java.util.Scanner;

abstract class Shape{
	double side, base, height, radius;
	abstract void display();
}
class Square extends Shape{ 
	Square(double side){
		this.side = side;
	}
	void display() {
		double area = side * side;
		System.out.println("The area of Square is : " + area);
	}
}
class Triangle extends Shape{
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	void display() {
		double area = 0.5 * base * height;
		System.out.println("The area of Triangle is : " + area);
	}
}
class Circle extends Shape{
	Circle(double radius){
		this.radius = radius;
	}
	void display() {
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("The area of Circle is : " + area);
	}
}
public class A2Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side for square : ");
		double side = sc.nextDouble();
		System.out.print("Enter the base and height for triangle : ");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.print("Enter the radius for circle : ");
		double radius = sc.nextDouble();
		Square s = new Square(side);
		Triangle t = new Triangle(base, height);
		Circle c = new Circle(radius);
		s.display();
		t.display();
		c.display();
		
		sc.close();
	}

}
