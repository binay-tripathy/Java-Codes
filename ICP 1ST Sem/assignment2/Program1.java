/*Author Name - Binay Krishna Tripathy
 *Regd. No - 2141020026
 *Branch And Section - CSE, 004
 *Date - 16/12/2021
 *Problem Description - Program that reads a Celsius degree then converts it to Fahrenheit and displays the result
 */

package assignment2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius : ");
		double cel = sc.nextDouble();
		double ft = (9.0/5)* cel + 32.0;
		System.out.println(cel + " Celsius is "+ ft + " Fahrenheit");
		
		sc.close();

	}

}
