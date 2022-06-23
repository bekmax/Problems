package crackingthecodinginterview.chapter2;

// You have two numbers represented by a linked list, where each node contains a single digit.
// The digits are stored in reverse order, such that the first digit is at the head of the list.
// Write a function that adds the two numbers and returns the sum as a linked list.

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

public class SumLists {
    public static void main(String[] args) {
        Node list1 = Util.loadData(3);
        Node list2 = Util.loadData(3);

        Util.print(list1);
        Util.print(list2);

        Node head = sumLists(list1, list2);
        Util.print(head);
    }

    // Iterative approach
    public static Node sumLists(Node list1, Node list2) {
        // create new result list
        Node head = new Node(0);
        Node current = head;
        int carry = 0;

        // iterate both list using while loop
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                current.next = new Node((list1.data + list2.data + carry) % 10);
                carry = (list1.data + list2.data) / 10;

                list1 = list1.next;
                list2 = list2.next;
            } else if (list1 != null) {
                current.next = new Node(list1.data + carry);
                list1 = list1.next;
            } else {
                current.next = new Node(list2.data + carry);
                list2 = list2.next;
            }
            current = current.next;
        }
        if (carry != 0) current.next = new Node(carry);
        // return the result
        return head.next;
    }

    // Recursive approach
    public static Node sumLists2(Node list1, Node list2) {
        return recursiveSum(list1, list2, 0);
    }

    public static Node recursiveSum(Node l1, Node l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        Node result = new Node(0);
        int value = carry;
        if (l1 != null) value += l1.data;
        if (l2 != null) value += l2.data;

        result.data = value % 10;

        if (l1 != null || l2 != null) {
            result.next = recursiveSum(
                    l1 == null ? null : l1.next,
                    l2 == null ? null : l2.next,
                    value / 10
            );
        }
        return result;
    }
}
