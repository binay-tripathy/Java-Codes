package assignment1;

import java.util.Scanner;

class Point {
	double x, y;
	
	void setPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	int findDistance(Point p1, Point p2) {
		int dist;
		dist = (int)Math.sqrt(Math.pow((p2.x - p1.x),2) +Math.pow((p2.y - p1.y),2));
		System.out.println("The distance between the two points are : " + dist);
		return dist;
	}
	void showArea(double dist) {
		double area;
		area = Math.PI*Math.pow(dist,2);
		System.out.println("Area is " + area);
	}
}

public class A1Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.print("Enter the coordinates of first point : ");
		p1.x = sc.nextDouble();
		p1.y = sc.nextDouble();
		System.out.print("Enter the coordinates of second point : ");
		p2.x = sc.nextDouble();
		p2.y = sc.nextDouble();
		p1.showArea(p1.findDistance(p1,p2));
		sc.close();
	}
}
