package assignment1;

import java.util.Scanner;

class Flower{
	String flower;
	int petals;
	float price;
	void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the flower : ");
		flower = sc.next();
		System.out.print("Enter the no of petals in the flower : ");
		petals = sc.nextInt();
		System.out.print("Enter the price of the flower : ");
		price  = sc.nextFloat();
		
		sc.close();
	}
	void Display() {
		System.out.println(flower + " flower of " + petals + " petals costs Rs." + price);
	}
}

public class A1Q12 {

	public static void main(String[] args) {
		Flower flo = new Flower();
		flo.getData();
		flo.Display();
	}

}
