package assignment6;

import java.util.Scanner;

public class Stack {
	static Scanner sc=new Scanner(System.in);
	public static final int MAX=10;
	public static int stack[]=new int[MAX],top=-1;

	public static void push(){
		if (isFull())
			System.out.println("Stack Overflow");
		else {
			System.out.print("Enter the element to push into stack : ");
			top++;
			stack[top] = sc.nextInt(); 
		}
	}
	
	public static void pop() {
		if(isEmpty())
			System.out.println("Stack Underflow");
		else {
			System.out.println("The deleted element is : " + stack[top]);
			top--;
		}
	}
	
	public static void display() {
		if (isEmpty())
			System.out.println("Stack is empty");
		else {
			for(int i = top; i>=0; i--)
				System.out.println(stack[i]);
		}
	}
	
	public static boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public static boolean isFull() {
		if(top==MAX-1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("***MENU*** \n 0: Exit \n 1: Push \n 2: Pop" +
			"\n 3: Display \n 4: Check if the Stack is Empty \n 5: Check if the Stack is Full \n "); 
			System.out.print("Enter your choice : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 0:	System.exit(0);
				case 1:	push();break;
				case 2:	pop();break;
				case 3:	display();break;
				case 4:	System.out.println(isEmpty());break;
				case 5:	System.out.println(isFull());break;
				default:System.out.println("Invalid choice");
			}
		}
	}
}