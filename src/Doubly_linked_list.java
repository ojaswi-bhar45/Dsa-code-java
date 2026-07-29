class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly_linked_list {
    static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    static void insertAtStart(Node head, int data){
        Node temp = new Node(data);

        temp.next = head;
        head.prev = temp;
        head = temp;

    }
    public static void main(String[] args) {
        Node head = new Node(10);
//        Node second = new Node(30);
//        Node third = new Node(50);

        head.prev =  null;
        head.next = null;

        System.out.print(" list is: ");
        printList(head);

        insertAtStart(head, 20);

        System.out.println("After inserting the node at the beginning:");
        printList(head);
    }
}
