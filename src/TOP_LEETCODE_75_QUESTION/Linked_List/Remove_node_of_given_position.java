package TOP_LEETCODE_75_QUESTION.Linked_List;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class Remove_node_of_given_position {
    static Node remove_node(Node head, int position){

        Node temp = head;
        int count = 0;
        while(temp != null){
            count ++;
            temp = temp.next;
        }

        int steps = count - position;

        if(steps == 0) return head.next;

        temp = head;
        for(int i = 0; i < steps - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

       return head;
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
        Node n3= new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(7);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        System.out.println("Before remove the nodeof given position: ");
        printList(head);

        head = remove_node(head, 2);

        System.out.println("After removing the list node of given position:");
        printList(head);

    }
}
