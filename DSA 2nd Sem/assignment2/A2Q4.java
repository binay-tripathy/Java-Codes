package assignment2;

import java.util.Scanner;

class PointType{
	double x,y;
	Scanner sc = new Scanner(System.in);
	void setCoords() {
		System.out.print("Enter the X and Y Coordinate of a point : ");
		x = sc.nextDouble();
		y = sc.nextDouble();
	}
	void displayPoint() {
		System.out.println("The point on the X-Y plane is : (" + x + " , " + y + ")");
	}
}
class CircleType extends PointType{
	double radius, area, circum;
	Scanner sc = new Scanner(System.in);
	void setRadius() {
		System.out.print("Enter the radius of the circle in cm : ");
		radius = sc.nextDouble();
	}
	void display_circleDetails() {
		area = Math.PI*(Math.pow(radius, 2));
		circum = 2 * Math.PI * radius;
		System.out.println("The circumference of the circle is : " + circum);
		System.out.println("The area of the circle is : " + area);
		System.out.println("The centre of the circle is : (" + x + " , " + y + ")");
	}
}
public class A2Q4 {

	public static void main(String[] args) {
		CircleType c = new CircleType();
		c.setCoords();
		c.displayPoint();
		c.setRadius();
		c.display_circleDetails();
	}

}
