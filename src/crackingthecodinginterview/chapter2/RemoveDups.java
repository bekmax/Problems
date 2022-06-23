package crackingthecodinginterview.chapter2;

// Write code to remove duplicates from an unsorted linked list.

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

import java.util.*;

public class RemoveDups {
    public static void main(String[] args) {

        Node head = Util.loadData(10);
        Util.print(head);

        removeDuplicates2(head);

        Util.print(head);

    }

    // Time Complexity O(N)
    // Space Complexity O(N)
    public static void removeDuplicates1(Node node) {
        Set<Integer> mySet = new HashSet<>();
        Node previous = null;

        while (node != null) {
            if (mySet.contains(node.data)) {
                previous.next = node.next;
            } else {
                mySet.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }

    // Time Complexity O(N2)
    // Space Complexity 0(1)
    public static void removeDuplicates2(Node node) {
        while (node != null) {
            Node current = node.next;
            while (current != null) {
                if (Objects.equals(node.data, current.data)) {
                    current.previous.next = current.next;
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                }
                current = current.next;
            }
            node = node.next;
        }
    }
}
