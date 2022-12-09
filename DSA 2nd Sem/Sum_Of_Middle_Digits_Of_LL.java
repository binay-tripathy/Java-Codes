import java.util.Scanner;

class Node1{
	int  info;
	Node1 next;
}

public class Sum_Of_Middle_Digits_Of_LL {
	static Scanner sc = new Scanner(System.in);
	public static Node1 start;

	public static void insert(Node1 p){
		System.out.print("Enter info : ");
		p.info = sc.nextInt();
	}
	
	public static void create(){
		Node1 q = null;
		char ch;
		do {
			Node1 p = new Node1();
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
			Node1 q = start;
			while (q!=null) {
				if (q.next!=null)
					System.out.print(q.info + "-->");
				else
					System.out.print(q.info + " \n ");
				q=q.next;
			}
		}
	}
	
	public static void insend() {
		Node1 p = new Node1();
		insert(p);
		if(start!=null) {
			Node1 q = start;
			while(q.next!=null)
				q=q.next;
			q.next = p;
		}
		else
			start = p;
	}
    public static int mid_value(int num){
        // int count = (int)Math.floor(Math.log10(num)+1);
        int count = 0, temp = num;
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        int mid  = (count+1)/2;
        int mid_val = (num/(int)Math.pow(10,mid-1))%10;
        return mid_val;
    }
    public static void mid_sum(){
        Node1 p = start;
        int sum = 0;
        while(p!=null){
            int mid = mid_value(p.info);
            sum += mid;
            p = p.next;
        }
        System.out.println("The sum of the middle elements of the nodes is : " + sum);
    }

    public static void main(String[] args) {
        while(true){
			System.out.println("****MENU***** \n 0:Exit \n 1:Creation \n 2:Display \n 3:Insert at End \n 4:Middle Sum \n");
			System.out.print("Enter the choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 0:	System.exit(0);
				case 1:	create(); break;
				case 2: display(); break;
				case 3:	insend(); break;
				case 4:	mid_sum(); break;
				default:System.out.println("Wrong choice");
			}
		}
    }
}