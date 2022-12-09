package assignment3;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight in kg and height in m : ");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		double bmi = w / (h * h);
		
		if(bmi<18.5) {
			System.out.println("You are underweight");
		}
		else if(bmi<=24.9) {
			System.out.println("You are normal weight");
		}
		else if(bmi<=29.9) {
			System.out.println("You are overweight");
		}
		else{
			System.out.println("You are obese");
		}
		
		sc.close();
	}

}
