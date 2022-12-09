package DSA_Minor_Project;

import java.util.Scanner;

class Node{
	int info;
	Node link;
}

public class SingleLinkedList{
	static Scanner sc = new Scanner(System.in);
	public static Node start = null;
	
	public static void create(){
		Node q = new Node();
		char ch;
		do {
			Node p = new Node();
			System.out.print("Enter info : ");
			p.info = sc.nextInt();
			p.link = null;
			if(start==null)
				q = start = p;
			else
				q = q.link = p;
			System.out.print("Do u want to create more nodes : Y/N ?");
			ch = sc.next().charAt(0);
			
		}while(ch=='Y' || ch=='y');
	}
	
	public static void display(){
		if (start == null)
			System.out.println("L.L is empty");
		else {
			Node q = start;
			while (q!=null) {
				if (q.link!=null)
					System.out.print(q.info + "-->");
				else
					System.out.print(q.info);
				q=q.link;
			}
		}
		System.out.println();
	}
	
	public static int find2ndMax() {
		Node p = start;
		
		int max = p.info;
		while (p != null) {
			if (p.info >= max)
				max = p.info;
			p = p.link;
		}
		Node q = start;
		int max2 = q.info;
		while (q != null) {
			if (q.info >= max2 && q.info < max)
				max2 = q.info;
			q = q.link;
		}
		return max2;
	}
		
	public static void search(int item){
		Node q = start;
		System.out.println("Search is successful and the key is found at position : " );
		while(q!=null) {
			if (q.info == item)
				System.out.println(q);
			q = q.link;
		}
	}
	
	public static void removeDuplicate() {
		Node p=start,q=null,temp=null;
		if(start==null)
			return;
		else{
			while(p!=null){
				temp=p;
				q=p.link;
				while(q!=null){
					if(p.info==q.info)
						temp.link=q.link;
					else
						temp=q;
					q=q.link;
				}
				p=p.link;
			}
		}
	}
	
	public static int countUnique() {
		Node p=start, q=start;
		int res = 0;
		int count = 0;
		while(q!=null){
			p=q.link;
			while(p!=null){
				if(q.info==p.info)
					res=1;
				p=p.link;
			}
			if(res==0){
				count++;
			}
			res=0;
			q=q.link;
		}
		return count;
	}
	
	public static void main(String[] args) {
		

		while(true){
			System.out.println("****MENU*****");
			System.out.println("0:Exit");
			System.out.println("1:Creation");
			System.out.println("2:Display");
			System.out.println("3:2nd Largest");
			System.out.println("4:Search the reference of an element");
			System.out.println("5:Remove Duplicates");
			System.out.println("6:Count no of Unique Elements");
			System.out.println();
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 0:
					System.exit(0);
				case 1:
					create();
					break;
				case 2:
					display();
					break;
				case 3:
					System.out.println("The 2nd largest element in the list is : " + find2ndMax());
					break;
				case 4:
					System.out.print("Enter the item you want to search : ");
					int item = sc.nextInt();
					search(item);
					break;
				case 5:
					removeDuplicate();
					break;
				case 6:
					System.out.println("The no of unique elements in the list are " + countUnique());
					break;
				default:
					System.out.println("Wrong choice");
			}
		}
	}
}