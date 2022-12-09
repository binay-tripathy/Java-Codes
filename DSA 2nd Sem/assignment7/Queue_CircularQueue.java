package assignment7;

import java.util.Scanner;

public class Queue_CircularQueue {
	
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
				rear = rear+1%MAX;
			// else if(front!=0 && rear==MAX-1)
			// 	rear = 0;
			// else
			// 	rear++;
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
				front = front+1%MAX;
		}
	}
	
	public static void display() {
		if(is_empty()) 
			System.out.println("Queue is Empty");
		
		else {
			if(front<=rear) {
				for(int i = front; i<=rear; i++)
					System.out.println(queue[i]);
			}
			else {
				for(int i = front; i<=MAX-1; i++)
					System.out.println(queue[i]);
				
				for(int i = 0; i<=rear; i++)
					System.out.println(queue[i]);
			}
		}
	}
	
	public static boolean is_full() {
//		if ((rear == MAX-1) || rear == (front-1))
		if (front == (rear+1%MAX))
			return true;
		else
			return false;
	}
	
	public static boolean is_empty() {
		if (front==-1)
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