package assignment3;

public class A3Q12 {
	
	static void bin(int a[], int lb, int ub, int key) {
		if (lb>ub) {
			System.out.println("Search is unsuccessful.");
		}
		else {
			int mid = (lb+ub)/2;
			if(a[mid]==key) {
				System.out.println("Search is successful at index " + mid);
			}
			else if (a[mid]>key) 
				bin(a,lb,mid-1,key);
							
			else
				bin(a,mid+1,ub,key);
		}
	}

	public static void main(String[] args) {
		int a[] = {1,3,4,5,7,9,11};
		int key = 4;
		bin(a,0,a.length-1,key);

	}

}
