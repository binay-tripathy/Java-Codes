package assignment2;

public class Program19 {

	public static void main(String[] args) {
		double bs = Double.parseDouble(args[0]);
		double da = (0.4)*bs; 
		double hr = (0.2)*bs;
		double gross = bs + da + hr;
		System.out.println("The gross salary is " + gross);

	}

}
