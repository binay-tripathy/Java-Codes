package assignment2;

public class Program14 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println((a%b == 0) || (b%a ==0));
	}

}
