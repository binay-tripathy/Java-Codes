/*Author Name - Binay Krishna Tripathy
 *Regd. No - 2141020026
 *Branch And Section - CSE, 004
 *Date - 9/12/2021
 *Problem Description - To print the following output with 'String ruler1=â€�1â€�'
						1
						1 2 1
						1 2 1 3 1 2 1
						1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 */

package assignment1;
public class Program13 {

	public static void main(String[] args) {
		String ruler1 = "1";
		String ruler2 = ruler1 + " 2 " + ruler1;
		String ruler3 = ruler2 + " 3 " + ruler2;
		String ruler4 = ruler3 + " 4 " + ruler3;
		System.out.println(ruler1);
		System.out.println(ruler2);
		System.out.println(ruler3);
		System.out.println(ruler4);

		
		
		
		
//		String ruler1 = "1";
//		String ruler2 = "1 2 1";
//		String ruler3 = "1 2 1 3 1 2 1";
//		String ruler4 = "4 1 2 1 3 1 2 1";
//		
//		System.out.println(ruler1);
//		System.out.println(ruler2);
//		System.out.println(ruler3);
//		System.out.println(ruler3+" "+ruler4);

		
		
		
		
//		String ruler1 = " 1 ";
//		System.out.println(ruler1);
//		
//		ruler1= ruler1 + 2 + ruler1;
//		System.out.println(ruler1);
//		
//		ruler1=ruler1 + 3 + ruler1;
//		System.out.println(ruler1);
//		
//		ruler1=ruler1 + 4 + ruler1;
//		System.out.println(ruler1);
	}

}
