package assignment6;

import java.util.Scanner;

class Node {
	int info;
	Node next;
}

public class Stack_LinkedList {
	static Scanner sc = new Scanner(System.in);
	public static Node top = null;
	
	public static void push() {
		Node p = new Node();
		System.out.print("Enter info : ");
		p.info = sc.nextInt();
		p.next = top;
		top = p;
	}
	
	public static void pop() {
		if (top == null)
			System.out.println("Stack Underflow");
		else {
			Node p = top;
			top = top.next;
			p.next = null;
			System.out.println("Deleted node is : " + p.info);
		}
	}
	
	public static void display() {
		if(top == null)
			System.out.println("Stack is empty");
		else {
			Node p = top;
			while(p!=null) {
				if (p.next!=null)
					System.out.print(p.info + "-->");
				else
					System.out.print(p.info + "\n");
				p=p.next;
			}
		}
	}
	

	public static void main(String[] args) {
		while (true) {
			System.out.println("****MENU**** \n 0:Exit \n 1:Push \n 2:Pop \n 3:Display \n ");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
				case 0:	System.exit(0);
				case 1:	push();break;
				case 2:	pop();break;
				case 3:	display();break;
				default:System.out.println("Wrong choice");
			}
		}
	}
}
