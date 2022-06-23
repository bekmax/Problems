package crackingthecodinginterview.chapter2;

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

// Write code to partition a linked list around a value x, such that all nodes
// less than x come before all nodes greater than or equal to x.
// If x is contained within the list, the values of x only need to be after the elements
// less than x. The partition element x can appear anywhere in the "right partition";
// it does not need to appear between the left and right partitions.
public class Partition {
    public static void main(String[] args) {
        Node head = Util.loadData(10);

        Util.print(head);
        Node node = partition(head, 5);
        Util.print(node);
    }

    public static Node partition(Node head, int pivot) {
        Node beforeHead = null;
        Node before = null;
        Node afterHead = null;
        Node after = null;

        while (head != null) {
            if (head.data < pivot) {
                if (before == null) {
                    beforeHead = new Node(head.data);
                    before = beforeHead;
                } else {
                    before.next = new Node(head.data);
                    before = before.next;
                }
            } else {
                if (after == null) {
                    afterHead = new Node(head.data);
                    after = afterHead;
                } else {
                    after.next = new Node(head.data);
                    after = after.next;
                }
            }
            head = head.next;
        }
        before.next = afterHead;

        return beforeHead;
    }
}
