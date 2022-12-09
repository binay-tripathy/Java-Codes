import java.util.Scanner;

class Node{
    int info;
    Node next;
}
public class CircularLinkedList {
    static Scanner sc = new Scanner(System.in);
    public static Node start = null;

    public static void create(){
        Node q = null;
        char ch;
        do{
            Node p = new Node();
            System.out.print("Enter info: ");
            p.info = sc.nextInt();
            p.next = start;
            if(start == null)
                q = start = p;
            else                
                q = q.next = p;
            System.out.print("Do you want to create more nodes (Y/N) ? ");
            ch = sc.next().charAt(0);
        }
        while(ch=='Y'||ch=='y');
    }

    public static void display(){
        Node p = start;
        if (start == null)
            System.out.println("List is Empty");
        else if (p.next == start)
            System.out.println(p.info);
        else{
            do{
                System.out.print(p.info + "-->");                    
                p = p.next;
            }
            while(p != start);
        }
    }

    public static void main(String[] args) {
        create();
        display();
    }
}
