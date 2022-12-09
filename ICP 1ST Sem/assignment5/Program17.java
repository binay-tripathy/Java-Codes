package assignment5;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to find the square root :");
        double c = sc.nextDouble();
        double e = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > e*t)
        {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
        
        sc.close();
        
	}

}
