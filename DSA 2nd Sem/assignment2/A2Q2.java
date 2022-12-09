package assignment2;

import java.util.Scanner;

class Complex{
	int real, imag;
	Scanner sc = new Scanner(System.in);
	void setData() {
		System.out.print("Real : ");
		real = sc.nextInt();
		System.out.print("Imaginary : ");
		imag = sc.nextInt();
	}
	void display() {
		System.out.println("The sum of the two complex numbers is : " + real + " + " + imag + "i");
	}
	Complex add(Complex c1, Complex c2) {
		real += c2.real;
		imag += c2.imag;
		return c1;
	}
}
public class A2Q2 {

	public static void main(String[] args) {
		
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		System.out.println("Enter first complex no");
		c1.setData();
		System.out.println("Enter second complex  no");
		c2.setData();
		c1.add(c1,c2);
		c1.display();
	}

}
