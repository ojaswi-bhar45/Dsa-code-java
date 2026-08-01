package TOP_LEETCODE_75_QUESTION.Linked_List;
//https://leetcode.com/problems/reorder-list/description/


public class Reordered_list {
    static void reordered_list(Node head){
        if (head == null) return;

        //1. Find the middle

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half

        Node second = slow.next;
        slow.next = null;

        Node prev = null;

        while(second != null){
            Node next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        // Merge both halves

        Node first = head;
        second = prev;

        while(second != null){
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5= new Node(5);


        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println("Before reordered the list: ");
        printList(head);


        reordered_list(head);


        System.out.println("after redordered the list: ");
        printList(head);

    }
}
