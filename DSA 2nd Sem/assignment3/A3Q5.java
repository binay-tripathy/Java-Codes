package assignment3;

//import java.util.ArrayList;
//import java.util.Arrays;

public class A3Q5 {
	public static < E > void printArray( E[] inputArray) {
		for(int i = 0; i<inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
//		ArrayList<Object> A = new ArrayList<>(5);
//		
//		A.add("abc");
//		A.add(1);
//		System.out.print(A.get(0));
//		System.out.println(A.get(1));	
		
		Integer a[] = {1,2,3,4,5};
		Double b[] = {1.2,2.3,3.4,4.5};
		String c[] = {"Binay" , "Shraddha" , "Utsav" , "Ipssa"};
		System.out.print("Integer Array : ");
		printArray(a);
		System.out.print("Double Array : ");
		printArray(b);
		System.out.print("String Array : ");
		printArray(c);

	}

}
