/*Author Name - Binay Krishna Tripathy
 *Regd. No - 2141020026
 *Branch And Section - CSE, 004
 *Date - 2/12/2021
 *Problem Description - To exchange the values of two variables A and B without using third temporary variable
 */

package assignment1;

public class Program8 {

	public static void main(String[] args) {
		int a = 3, b = 4;
		a+=b;
		b=a-b;
		a-=b;

		System.out.println("The reversed number of a is " + a);
		System.out.println("The reversed number of b is " + b);
	}

}
