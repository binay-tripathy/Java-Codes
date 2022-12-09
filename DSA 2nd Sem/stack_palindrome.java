import java.util.Scanner;

public class stack_palindrome {
    static Scanner sc=new Scanner(System.in);
	public static final int MAX=10;
	public static int stack[]=new int[MAX],top=-1;

	public static void push(){
		if (top==MAX-1)
			System.out.println("Stack Overflow");
		else {
			System.out.print("Enter the element to push into stack : ");
			top++;
			stack[top] = sc.nextInt(); 
		}
	}
    public static void pop() {
		if(top == -1)
			System.out.println("Stack Underflow");
		else {
			System.out.println("The deleted element is : " + stack[top]);
			top--;
		}
	}
	public static void display() {
		if (top==-1)
			System.out.println("Stack is empty");
		else {
			for(int i = top; i>=0; i--)
				System.out.println(stack[i]);
		}
	}

    public static boolean palin() {
        // int arr[] = stack;
        int rev[] = new int[MAX];
        for (int i = stack.length-1, j = 0; i>=0; i--, j++)
            rev[j] = stack[i];
        for (int i = 0; i<stack.length; i++){
            if(rev[i] != stack [i])
                return false;
        }
		return true;
        
    }
    public static void main(String[] args) {
        while(true) {
			System.out.println("***MENU*** \n 0: Exit \n 1: Push \n 2: Display \n 3: Palindrome Check \n "); 
			System.out.print("Enter your choice : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 0:	System.exit(0);
				case 1:	push();break;
				case 2:	display();break;
				case 3:	System.out.println(palin());
				default:System.out.println("Invalid choice");
			}
		}
    }
}