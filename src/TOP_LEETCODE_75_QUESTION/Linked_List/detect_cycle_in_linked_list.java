//https://leetcode.com/problems/linked-list-cycle/description/

package TOP_LEETCODE_75_QUESTION.Linked_List;

public class detect_cycle_in_linked_list {

    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // cycle at node 2

        System.out.println(hasCycle(head)); // true

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        System.out.println(hasCycle(head2)); // false
    }
}
