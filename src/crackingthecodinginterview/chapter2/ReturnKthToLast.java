package crackingthecodinginterview.chapter2;

// Implement an algorithm to find the kth to last element of a singly linked list

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

public class ReturnKthToLast {
    public static void main(String[] args) {

        Node head = Util.loadData(10);
        Util.print(head);

        System.out.println(returnKthToLast(head, 12));
        System.out.println(returnKthToLast2(head, 1));
    }

    // Iterative method
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static Integer returnKthToLast(Node node, int k) {
        Node p1 = node;
        Node p2 = node;

        for (int i = 0; i < k; i++) {
            if (p2 == null)
                throw new IllegalArgumentException("Linked list has fewer than " + k + " elements");
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.data;
    }

    // Recursive Method
    // Time Complexity O(N)
    // Space Complexity O(N)
    public static Integer returnKthToLast2(Node node, int k) {
        return recursiveHelper(node, k)[0];
    }

    public static int[] recursiveHelper(Node node, int k) {
        int[] arr = {0, 1};
        if (node.next == null) {
            arr[0] = node.data;
            return arr;
        }

        arr = recursiveHelper(node.next, k);
        if (arr[1] == k) {
            return arr;
        }
        arr[0] = node.data;
        arr[1] += 1;
        return arr;
    }

}
