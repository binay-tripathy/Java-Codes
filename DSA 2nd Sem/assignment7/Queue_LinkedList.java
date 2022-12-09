package assignment7;

import java.util.Scanner;

class Node {
	int info;
	Node next;
}

public class Queue_LinkedList {
	
	public static Node front, rear;
	static Scanner sc = new Scanner(System.in);
	
	public static void insert() {
		Node p = new Node();
		System.out.print("Enter info : ");
		p.info = sc.nextInt();
		if(front==null)
			front = rear = p;
		else {
			rear.next = p;
			rear = p;
		}
	}
	
	public static void display() {
		if(front == null)
			System.out.println("Queue is Empty");
		else {
			Node p = front;
			while (p!=null) {
				if (p.next!=null)
					System.out.print(p.info + "-->");
				else
					System.out.print(p.info + "\n");
				p=p.next;
			}
		}
	}
	
	public static void delete() {
		if(front==null)
			System.out.println("Queue is Empty");
		else {
			Node p = front;
			front = front.next;
			p.next = null;
			System.out.println("The deleted node is " + p.info);
		}
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("****MENU**** \n 0: Exit \n 1: Insert \n 2: Display \n 3: Delete \n ");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
				case 0:	System.exit(0);
				case 1:	insert();break;
				case 2:	display();break;
				case 3:	delete();break;
				default:System.out.println("Wrong choice");
			}
		}
	}
}
