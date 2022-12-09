package assignment2;
import A2Q9_1.*;
import A2Q9_2.*;
public class A2Q9 {

	public static void main(String[] args) {
		Test t = new Test();
		t.input();
		t.output();
		double mark = t.mark1 + t.mark2;
		int score = Sports.score1 + Sports.score2; 
		System.out.println("The total mark scored is " + mark + " and the total score is " + score);
		
	}

}
