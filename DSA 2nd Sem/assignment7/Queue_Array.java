package assignment7;

import java.util.Scanner;

public class Queue_Array {
	
	public static final int MAX = 5;
	public static int front = -1, rear = -1, queue[] = new int[MAX];
	static Scanner sc = new Scanner(System.in);
	
	public static void insert() {
		if (is_full())
			System.out.println("Overflow");
		else {
			if(front==-1)
				front = rear = 0;
			else
				rear++;
			System.out.print("Enter the value : ");
			queue[rear] = sc.nextInt();	
		}
	}

	public static void delete() {
		if(is_empty())
			System.out.println("Underflow");
		else {
			System.out.println("The deleted element is : " + queue[front]);
			if(front==rear)
				front=rear=-1;
			else
				front++;
		}
	}
	
	public static void display() {
		if(is_empty()) 
			System.out.println("Queue is Empty");
		else {
			for(int i = front; i<=rear; i++)
				System.out.println(queue[i]);
		}
	}
	
	public static boolean is_full() {
		if (rear == MAX-1)
			return true;
		else
			return false;
	}
	
	public static boolean is_empty() {
		if (rear==-1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("***MENU*** \n 0: Exit \n 1: Insert \n 2: Delete \n 3: Display \n ");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
				case 0:	System.exit(0);
				case 1:	insert();break;
				case 2:	delete();break;
				case 3:	display();break;
				default:System.out.println("Invalid choice");
			}
		}
	}
}