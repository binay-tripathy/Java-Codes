/*Author Name - Binay Krishna Tripathy
 *Regd. No - 2141020026
 *Branch And Section - CSE, 004
 *Date - 2/12/2021
 *Problem Description - To exchange the values of two variables A and B using third temporary variable C
 */

package assignment1;

public class Program7 {

	public static void main(String[] args) {
		int a = 5, b = 10;
		int c = a;
		a = b;
		b = c;
		System.out.println("The first reversed no. is "+ a);
		System.out.println("The second reversed no. is "+ b);
	}

}
