package assignment1;
import java.util.Scanner;

public class A1Q2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a no greater than 2 : ");
		int a  = sc.nextInt();
		int count = 0;
		if (a<2)
			System.out.println("The no. is less than 2");
		else {
			for (;a>=2;a/=2)
				count++;
			System.out.println("The no. of times the number can be divided by 2 is : " + count);
		}
	}
}
