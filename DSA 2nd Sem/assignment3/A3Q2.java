package assignment3;

public class A3Q2 {

	public static void main(String[] args) {
		String arr[] = {"White", null , "Blue", "Purple"};
		try {
			System.out.println(arr[1].length());
		}
		catch(NullPointerException ex){
			System.out.println("There is no length for null String.");
		}
		try {
			arr[4] = "Orange";
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index is out of bounds.");
		}
	}

}
