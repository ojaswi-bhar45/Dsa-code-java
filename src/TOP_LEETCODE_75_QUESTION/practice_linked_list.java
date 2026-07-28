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

    public static void main(String[] args) {

    // Create the Node
    Node head = new Node(10);


    Node newNode = new Node(5);
        head.next = newNode;
        newNode.next = null;

        Node newNode2 = new Node(4);
        head.next = newNode2;
        newNode2.next = newNode;


    //Pint the list

    Node temp = head;

    while(temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
    }

        System.out.println("null");
    }
}
