package assignment4;

public class Program7 {

	public static void main(String[] args) {
		int sum = 0, sumsq = 0;
		
		for (int i = 1; i<=10; i++) {
			sum += Math.pow(i, 2);
			sumsq += i;
		}
				
		System.out.println("The sum of the squares of the first ten natural numbers is : "+ sum);
		System.out.println("The square of the sum of the first ten natural numbers is : " + Math.pow(sumsq, 2));
		System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the squares of the sum is " + Math.pow(sumsq, 2) + " - " + sum + " = " + ((Math.pow(sumsq, 2)) - sum));

	}

}
