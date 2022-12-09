package assignment1;
import java.util.Scanner;

public class A1Q7 {
	
	public static void distele(int n[]) {
		System.out.println("The pair of the distinct elements whose product is odd are : ");
		for (int i = 0; i<n.length-1;i++) {
			for (int j = i+1; j<n.length; j++) {
				if (n[i] != n[j]) {
					if (n[i]*n[j] % 2 != 0) {
						System.out.println(n[i] + "," + n[j]);
					}
				}
			}
		}
//		int b = 0;
//		int count = 0;
//		for (int i = 0; i<n.length; i++) {
//			if (b!=n[i] && (n[i]&1) == 1 ) {
//				if(count == 0) b = n[i];
//				count++;
//			}
//			if(count == 2)
//			{
//				System.out.println(b + " " + n[i]);
//				count = 0;
//				i--;
//			}
//		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the list : ");
		int x = sc.nextInt();
		int n[] = new int [x];
		System.out.print("Enter a list of integers : ");
		for (int i = 0; i<n.length; i++) {
			n[i] = sc.nextInt();
		}
		distele(n);
		
		sc.close();

	}

}
