/*Name
 * Regd. No.:
 * Date:
 * Desc.: Write a Java program that takes as input three integers, a, b, and c, from the Java console
		and determines if they can be used in a correct arithmetic formula (in the given order), like
		“a + b = c,” “a = b − c,” or “a * b = c.”
 */
package assignment1;
import java.util.Scanner;
public class A1Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no. a : ");
		int a = sc.nextInt();
		System.out.print("Enter a no. b : ");
		int b = sc.nextInt();
		System.out.print("Enter a no. c : ");
		int c = sc.nextInt();
		
		if ((a+b)==c)
			System.out.println("Condition 1 is Satisfied.");
		else
			System.out.println("Condition 1 is not Satisfied.");
		if (a==(b-c))
			System.out.println("Condition 2 is Satisfied.");
		else
			System.out.println("Condition 2 is not Satisfied.");
		if ((a*b) == c)
			System.out.println("Condition 3 is Satisfied.");
		else
			System.out.println("Condition 3 is not Satisfied.");
		
		sc.close();

	}

}
