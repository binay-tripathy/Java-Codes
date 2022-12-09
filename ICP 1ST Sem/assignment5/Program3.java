package assignment5;

public class Program3 {
	public static void main(String[] args) {
		for(int i=100; i<=1000; ) {
			int count = 1;
			while(count<=10 && i<=1000) {
				if(i%5==0 && i%6==0) {
					System.out.print(i+" ");
					count++;
				}
				i++;
			}
			System.out.println();
		}
		
	}

}
