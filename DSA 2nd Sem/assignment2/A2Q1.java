package assignment2;

import java.util.Scanner;

class Commision{
	double sales;
	Commision(double sales){
		this.sales = sales;
	}
	double getCommision(){
		double comm = 0;
		if (sales<500)
			comm = sales + (0.02*sales);
		else if (sales>=500 && sales<5000)
			comm = sales + (0.05*sales);
		else
			comm = sales + (0.08*sales);
		return comm;
	}
}
public class A2Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sales : ");
		double sales = sc.nextDouble();
		if (sales<0)
			System.out.println("Invalid input");
		else {
			Commision c1 = new Commision(sales);
			System.out.println("The commision for the amount " + sales + " is " + c1.getCommision());
		}
		sc.close();
	}

}
