//Write a java program that takes two arrays a and b of length n storing int values and returns a dot product of a and b
package assignment1;
import java.util.Scanner;

public class A1Q8 {

	public static int[] dotprod(int a[], int b[], int n) {
		int c[] = new int[n] ;
		for(int i = 0; i<a.length; i++)
				c[i] = a[i] * b[i];
		return c;
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the length of the list : ");
			int n = sc.nextInt();
			int a[] = new int [n];
			int b[] = new int [n];
			
			System.out.print("Enter a list of integers : ");
			for (int i = 0; i<a.length; i++)
				a[i] = sc.nextInt();
			for (int j = 0; j<b.length; j++)
				b[j] = sc.nextInt();
			
			int c[] = dotprod(a,b,n);
			
			for(int i=0 ; i<c.length ; i++)
				System.out.print(c[i] + " ");
			
			sc.close();

	}

}
