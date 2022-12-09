import java.util.Scanner;

class Node2{
	int  info;
	Node2 next;
}

public class test_SLL {
	static Scanner sc = new Scanner(System.in);
	public static Node2 start;

	public static void insert(Node2 p){
		System.out.print("Enter info : ");
		p.info = sc.nextInt();
	}
	
	public static void create(){
		Node2 q = null;
		char ch;
		do {
			Node2 p = new Node2();
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
			System.out.println("L.L is empty");
		else {
			Node2 q = start;
			while (q!=null) {
				if (q.next!=null)
					System.out.print(q.info + "-->");
				else
					System.out.print(q.info + " \n ");
				q=q.next;
			}
		}
	}
	
	
	public static void insbeg() {
		Node2 p = new Node2();
		insert(p);
		p.next = start;
		start = p;
	}
	
	public static void insend() {
		Node2 p = new Node2();
		insert(p);
		if(start!=null) {
			Node2 q = start;
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
		Node2 q = start;
		while (q.next!=null) {
			count ++;
			q = q.next;
		}
		if (pos==1) 
			insbeg();
		else if (pos==(count+1))
			insend();
		else {
			Node2 p = new Node2();
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
			Node2 p = start.next;
			start.next = null;
			start = p;
		}
		else 
			System.out.println("The LL is empty.");
	}
	
	public static void delend() {
		if(start!=null) {
			Node2 p = start;
			while(p.next.next!=null)
				p=p.next;
			p.next = null;
		}
		else
			System.out.println("The LL is empty.");
	}
	
	public static void delany() {
		System.out.print("At which position you want to delete the node : ");
		int pos = sc.nextInt();
		int count = 1;
		Node2 p = start;
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
			Node2 q = p.next;
			p.next = q.next;
			q.next = null;
		}
	}
	
	
	public static void search() {
		Node2 q = start;
		System.out.print("Enter the key : ");
		int key = sc.nextInt();
		int flag = 0, pos = 1;
		while(q!=null) {
			if (q.info == key) {
				flag = 1;
				System.out.println("Search is successful and the key is found at position " + pos);
				break;
			}
			pos++;
			q = q.next;
		}
		if (flag==0)
			System.out.println("Search is unsuccessful.");
	}
	
	public static void sort() {
		Node2 p =  start, q = start;
		Node2 t = new Node2();
		while (p!=null) {
			q = start;
			while (q!=null) {
				if (p.info<q.info) { 
					//it is now in ascending order
					t.info = p.info;
					p.info = q.info;
					q.info = t.info;
				}
				q = q.next;
			}
			p = p.next;
		}
	}

	public static void count() {
		Node2 q = start;
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
			System.out.println("List contains only one Node2");
		else {
			Node2 p = null, q = start, r = start.next;
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
