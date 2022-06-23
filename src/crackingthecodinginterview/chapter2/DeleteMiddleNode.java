package crackingthecodinginterview.chapter2;

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

// Implement an algorithm to delete a node in the middle of a singly linked list,
// given only access to that node
public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node head = Util.loadData(5);
        Util.print(head);

        deleteMiddleNode2(head);
        Util.print(head);
    }

    // Iterative method using two pointers
    public static void deleteMiddleNode2(Node head) {
        if (head.next == null) return;

        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;
    }


}
