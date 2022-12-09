package assignment2;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds : ");
		double weight = sc.nextDouble();
		System.out.println("Enter the height in inches : ");
		double height = sc.nextDouble();
		weight*= 0.45359237;
		height*= 0.0254;
		double BMI = weight/(height* height);
		System.out.println("BMI is "+ BMI);
		
		sc.close();

	}

}
