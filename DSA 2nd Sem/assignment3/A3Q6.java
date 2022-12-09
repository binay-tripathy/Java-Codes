package assignment3;

public class A3Q6 {

	public static <T> int count(T[] array, T item) {
		int count = 0;
		for(int i = 0; i<array.length; i++) {
			if (array[i].equals(item))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Integer array[] = {5,48,64,46,1,39,46,4,3,48,33,48};
		Integer item = 48;
		System.out.println("The no of times item appears in the array is : " + count(array,item));
	}

}
