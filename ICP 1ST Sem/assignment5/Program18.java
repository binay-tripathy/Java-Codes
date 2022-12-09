package assignment5;

public class Program18 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		double xk = 1;
		double delx = 0, xpre=1;
		
		while(true) {
			xk = ((k-1.0)*xpre + n/Math.pow(xpre, k-1))/k;
			delx = Math.abs(xk - xpre);
			if(delx < 0.00001) {
				break;
			}
			xpre = xk;
		}
		System.out.println(k + "th root of " + n + " is: " + xk);
	}

}
