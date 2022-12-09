package assignment1;
import java.util.Scanner;

public class A1Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no. : ");
		String str[] = new String[sc.nextInt()];
		sc.nextLine();
		System.out.println("Enter "+ str.length + " lines: ");
		for (int i = 0; i<str.length; i++) 
			str[i] = sc.nextLine();
		
		for(int i = str.length-1; i>=0; i--)
			System.out.println(str[i]);
		
		sc.close();

	}

}
