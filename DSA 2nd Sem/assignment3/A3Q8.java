package assignment3;

public class A3Q8 {
	
	static int pow(int x, int n) {
		if (n==0)
			return 1;
		else
			return(x*pow(x,n-1));
	}

	public static void main(String[] args) {
		System.out.println(pow(2,10));
	}

}
