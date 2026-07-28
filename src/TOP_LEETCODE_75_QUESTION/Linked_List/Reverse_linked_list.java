//https://leetcode.com/problems/reverse-linked-list/description/

package TOP_LEETCODE_75_QUESTION.Linked_List;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Reverse_linked_list {
    static Node reverse_list(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;//save next node
            curr.next = prev;//Reverse the link
            prev = curr;//Move prev forward
            curr = next;//Move curr forward
        }

        return prev;

    }

    static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        //create nodes

        Node head = new Node(10);
        Node second= new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);


        // connect nodes

        head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("original linked list: ");
        printList(head);

        //Reverse the list
        head = reverse_list(head);

        //Reversed List
        System.out.println("\nReverse Linked list:");
        printList(head);


    }

}
