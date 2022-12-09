package assignment3;

public class A3Q9 {
	
	static int rev(int n) {
		if (n%10==0)
			return 0;
		else { 
			System.out.print(n%10);
			return rev(n/10);
		}
	}

	public static void main(String[] args) {
		rev(123);
	}

}
