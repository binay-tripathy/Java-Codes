package assignment1;
import java.util.Scanner;

public class A1Q5 {

	public static boolean isOdd(int n) {
		while(n>=2)
			n-=2;
		if (n==0)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int n = sc.nextInt();
		
		System.out.println(isOdd(n));
		
		sc.close();

	}

}
