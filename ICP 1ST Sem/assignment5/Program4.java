package assignment5;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0 : ");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println("No numbers are entered except 0.");
		}
		
		else {
			int positives=0, negatives=0;
			double total=0, average=0, count=0;
			while(n != 0) {
				count++;
				if(n>0) {
					positives++;
				}
				else {
					negatives++;
				}
				total += n;
				n = sc.nextInt();
			}
			
			average = total/count;
			System.out.println("The number of positives is : " + positives);
			System.out.println("The number of negatives is : " + negatives);
			System.out.println("The total is : " + total);
			System.out.println("The average is : " + average);
		}

		sc.close();
		
	}

}
