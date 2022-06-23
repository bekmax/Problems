package crackingthecodinginterview.chapter2;

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

import java.util.HashSet;
import java.util.Set;

// Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop
//
public class LoopDetection {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;

        System.out.println(detectLoop(head).data);
        System.out.println(detectLoop2(head).data);
    }

    public static Node detectLoop(Node list) {
        Set<Node> mySet = new HashSet<Node>();
        Node current = list;
        while (current != null) {
            if (mySet.contains(current)) {
                return current;
            } else {
                mySet.add(current);
            }
            current = current.next;
        }
        return null;
    }

    public static Node detectLoop2(Node list) {
        Node slow = list;
        Node fast = list;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) break;
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = list;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
