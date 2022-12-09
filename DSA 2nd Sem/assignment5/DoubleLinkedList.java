package assignment5;

import java.util.Scanner;

class Node{
	protected int info;
	protected float mark;
	protected Node next, prev;
}

public class DoubleLinkedList {
	
	static Scanner sc = new Scanner(System.in);
	public static Node start = null, end = null;

	public static Node insert(Node p){
		// System.out.print("Enter Registration No : ");
		// p.info = sc.nextInt();
		// System.out.print("Enter Marks : ");
		// p.mark = sc.nextFloat();

		System.out.print("Enter info : ");
		p.info = sc.nextInt();
		return p;
	}
	
	public static void create(){
		Node q = null;
		char ch;
		do {
			Node p = new Node();
			insert(p);
			if(start==null)
				q = start = end = p;
			else {
				p.prev = q;
				end = q = q.next = p;					
			}	
			System.out.print("Do u want to create more nodes : Y/N ?");
			ch = sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}
	
	// public static void display(){
	// 	if (start == null)
	// 		System.out.println("List is empty");
	// 	else {
	// 		Node q = start;
	// 		while (q!=null) {
	// 			if (q.next!=null)
	// 				System.out.print(q.info + " " + q.mark + "-->");
	// 			else
	// 				System.out.print(q.info + " " + q.mark + "\n");
	// 			q=q.next;
	// 		}
	// 	}
	// }

	public static void display(){
		if (end == null)
			System.out.println("List is empty");
		else {
			Node q = end;
			while (q!=null) {
				if (q.prev!=null)
					System.out.print(q.info + "-->");
				else
					System.out.print(q.info + "\n");
				q=q.prev;
			}
		}
	}
	
	public static void insbeg() {
		Node p = new Node();
		insert(p);
		p.next = start;
		if (start == null)
			start = end = p;
		else
			start = p.next.prev = p;
	}
	
	public static void insend() {
		Node p = new Node();
		insert(p);
		if(start == null)
			start = end = p;
		else {
			end.next = p;
			p.prev = end;
			end = p;
		}
	}
	
	public static void insany() {
		System.out.print("At which position you want to insert the node : ");
		int pos = sc.nextInt();
		int count = 1;
		Node q = start;
		while (q.next!=null) {
			count ++;
			q = q.next;
		}
		if (pos==1) 
			insbeg();
		else if (pos==(count+1))
			insend();
		else {
			Node p = new Node();
			insert(p);
			int i = 1;
			q = start;
			while(i<(pos-1)) {
				q = q.next;
				i++;
			}
			q.next.prev = p;
			p.next = q.next;
			p.prev = q;
			q.next = p;
		}
	}
	
	public static void delbeg() {
		if(start == null)
			System.out.println("List is empty.");
		else if(start == end) {
			System.out.println("Deleted node is " + start.info);
			start = end = null;
		}
		else {
			Node p = start;
			start = p.next;
			start.prev = null;
			p.next = null;
			System.out.println("Deleted node is " + p.info);
		}
	}
	
	public static void delend() {
		if(start == null)
			System.out.println("List is empty.");
		else if(start == end) {
			System.out.println("Deleted node is " + start.info);
			start = end = null;
		}
		else {
			Node p = end;
			end = p.prev;
			end.next = null;
			p.prev = null;
			System.out.println("Deleted node is " + p.info );
		}
	}
	
	public static void delany() {
		System.out.print("At which position you want to delete the node : ");
		int pos = sc.nextInt();
		int count = 1;
		Node p = start;
		while (p.next!=null) {
			count ++;
			p = p.next;
		}
		if (pos==1) 
			delbeg();
		else if (pos==count)
			delend();
		else {
			int i = 1;
			p = start;
			while(i<(pos-1)) {
				p = p.next;
				i++;
			}
			Node q = p.next;
			p.next = q.next;
			q.next.prev = p;
			q.prev = null;
			q.next = null;
			System.out.println("Deleted node is " + q.info);
		}
	}
	
	public static void search() {
		Node q = start;
		System.out.print("Enter the Registration No. you want to search : ");
		int regd = sc.nextInt();
		int flag = 0, pos = 1;
		while(q!=null) {
			if (q.info == regd) {
				flag = 1;
				System.out.println("Search is successful and the Registraion No is found at position " + pos);
				break;
			}
			pos++;
			q = q.next;
		}
		if (flag==0)
			System.out.println("Search is unsuccessful.");
	}

	public static void main(String[] args) {
		while(true){
			System.out.println("****MENU***** \n 0:Exit \n 1:Creation \n 2:Display" + 
			"\n 3:Insert at Beginning \n 4:Insert at End \n 5:Insert at AnyPosition"  + 
			"\n 6:Delete at Beginning \n 7:Delete at End \n 8:Delete at AnyPosition \n 9:Search in List \n");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 0:	System.exit(0);
				case 1:	create();break;
				case 2:	display();break;
				case 3:	insbeg();break;
				case 4:	insend();break;
				case 5:	insany();break;
				case 6:	delbeg();break;
				case 7:	delend();break;
				case 8:	delany();break;
				case 9:	search();break;
				default:System.out.println("Wrong choice");
			}
		}
	}

}
