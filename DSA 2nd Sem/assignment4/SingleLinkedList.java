package assignment4;

import java.util.Scanner;

class Node{
	protected int regd_no;
	protected float mark;
	protected Node next;
}

public class SingleLinkedList{
	static Scanner sc = new Scanner(System.in);
	public static Node start;

	public static Node insert(Node p){
		System.out.print("Enter Registration No : ");
		p.regd_no = sc.nextInt();
		System.out.print("Enter Marks : ");
		p.mark = sc.nextFloat();
		return p;
	}
	
	public static void create(){
		Node q = null;
		char ch;
		do {
			Node p = new Node();
			insert(p);
			if(start==null)
				q = start = p;
			else
				q = q.next = p;
			System.out.print("Do u want to create more nodes : Y/N ?");
			ch = sc.next().charAt(0);
			
		}while(ch=='Y' || ch=='y');
	}
	
	public static void display(){
		if (start == null)
			System.out.println("List is empty");
		else {
			Node q = start;
			while (q!=null) {
				if (q.next!=null)
					System.out.print(q.regd_no + " " + q.mark + "-->");
				else
					System.out.print(q.regd_no + " " + q.mark + "\n");
				q=q.next;
			}
		}
	}
	
	
	public static void insbeg() {
		Node p = new Node();
		insert(p);
		p.next = start;
		start = p;
	}
	
	public static void insend() {
		Node p = new Node();
		insert(p);
		if(start!=null) {
			Node q = start;
			while(q.next!=null)
				q=q.next;
			q.next = p;
		}
		else
			start = p;
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
			p.next = q.next;
			q.next = p;
		}
	}
	
	
	public static void delbeg() {
		if(start!=null) {
			Node p = start.next;
			start.next = null;
			start = p;
		}
		else 
			System.out.println("List is empty.");
	}
	
	public static void delend() {
		if(start!=null) {
			Node p = start;
			while(p.next.next!=null)
				p=p.next;
			p.next = null;
		}
		else 
			System.out.println("List is empty.");
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
			q.next = null;
			System.out.println("Deleted node is " + q.regd_no + " and " + q.mark);
		}
	}
	
	
	public static void search() {
		Node q = start;
		System.out.print("Enter the Registration No. you want to search : ");
		int regd = sc.nextInt();
		int flag = 0, pos = 1;
		while(q!=null) {
			if (q.regd_no == regd) {
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
	
	public static void sort() {
		Node p =  start, q = start;
		Node t = new Node();
		while (p!=null) {
			q = start;
			while (q!=null) {
				if (p.mark>q.mark) { 
					//it is now in ascending order
					t.mark = p.mark;
					t.regd_no = p.regd_no;
					p.mark = q.mark;
					p.regd_no = q.regd_no;
					q.mark = t.mark;
					q.regd_no = t.regd_no;
				}
				q = q.next;
			}
			p = p.next;
		}
	}

	public static void count() {
		Node q = start;
		int count = 1;
		while(q.next!=null) {
			count++;
			q = q.next;
		}
		System.out.println("The no of Nodes in the List is : " + count);
		
	}
	
	public static void reverse() {
		if(start==null)
			System.out.println("List is Empty.");
		else if(start.next==null)
			System.out.println("List contains only one Node");
		else {
			Node p = null, q = start, r = start.next;
			while(r!=null) {
				p = q;
				q = r;
				r = r.next;
				q.next = p;
			}
			start.next = null;
			start = q;
		}
	}
	
	public static void main(String[] args) {
		while(true){
			System.out.println("****MENU***** \n 0:Exit \n 1:Creation \n 2:Display \n 3:Insert at Beginning "+ 
			"\n 4:Insert at End \n 5:Insert at AnyPosition \n 6:Delete at Beginning \n 7:Delete at End \n 8:Delete at AnyPosition " + 
			"\n 9:Search in List \n 10:Sort the List \n 11:No of Nodes in the List \n 12:Reverse the List \n");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 0:	System.exit(0);
				case 1:	create(); break;
				case 2: display(); break;
				case 3:	insbeg(); break;
				case 4:	insend(); break;
				case 5:	insany(); break;
				case 6:	delbeg(); break;
				case 7:	delend(); break;
				case 8:	delany(); break;
				case 9:	search(); break;
				case 10:sort(); break;
				case 11:count(); break;
				case 12:reverse(); break;
				default:System.out.println("Wrong choice");
			}
		}
	}
	
}
