package assignment1;
import java.util.Scanner;

public class A1Q6 {
	public static void maxmin(int n[]) {
		int min = n[0];
		int min1 = n[0];
		int max = n[0];
		int max1 = n[0];
		for(int i = 1; i<=n.length-1;i++) {
			if (n[i] < min)
				min = n[i];
			else if (n[i] > max)
				max = n[i];
			min1 = Math.min(min1, n[i]);
			max1 = Math.max(max1, n[i]);
		}
		System.out.println("The minimum value by our method is : " + min);
		System.out.println("The maximum value by our method is : " + max);
		
		System.out.println("The minimum value by java method is : " + min1);
		System.out.println("The maximum value by java method is : " + max1);
						
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the list : ");
		int x = sc.nextInt();
		int n[] = new int [x];
		System.out.print("Enter a list of integers : ");
		for (int i = 0; i<n.length; i++)
			n[i] = sc.nextInt();
		maxmin(n);
		
		sc.close();

	}

}
