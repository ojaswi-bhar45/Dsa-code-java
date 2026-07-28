package TOP_LEETCODE_75_QUESTION;

//singly linked list

class Node{
    int data;
    Node next;

// construtor
    Node(int data){
        this.data = data;
        next= null;
    }
}
public class practice_linked_list {

    static Node deleteAtHead(Node head){
        //List is empty
        if(head == null){
            return null;
        }
        //move head to next node

        head = head.next;

        return head;
    }

    //Print linked list

    static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

    // Create the Node
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(40);

    head.next = second;
    second.next = third;
    third.next = fourth;


        System.out.println("Before Deletion the node");
        printList(head);

        head = deleteAtHead(head);

        System.out.println("After Deletion");
        printList(head);
    }
}
