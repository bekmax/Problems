package crackingthecodinginterview.chapter2;

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

import java.util.Objects;

// Given two singly linked list, determine if the two lists intersect.
// Return the intersecting node. Note that the intersection is defined based on reference, not value.
// That is, if kth node of the first linked list is the exact same node (by reference) as the jth node
// of the second linked list, then they are intersecting
public class Intersection {
    public static void main(String[] args) {

        Node l1 = Util.loadData(4);
        Node l2 = Util.loadData(4);

        Node node = new Node(-1);
        node.next = new Node(-2);
        l2.next.next.next.next = node;
        l1.next.next.next.next = node;
        Util.print(l1);
        Util.print(l2);

        Node result = isIntersecting(l1, l2);
        System.out.println(result != null ? result.data : null);

    }

    public static Node isIntersecting(Node l1, Node l2){
        int count1 = 0;
        int count2 = 0;

        Node current1 = l1;
        Node current2 = l2;

        while (current1.next != null){
            count1++;
            current1 = current1.next;
        }
        while (current2.next != null){
            count2++;
            current2 = current2.next;
        }

        if (!Objects.equals(current1, current2)) return null;

        current1 = l1;
        current2 = l2;
        if (count1 > count2){
            int diff = count1 - count2;
            for (int i = 0; i < diff; i++) {
                current1 = current1.next;
            }
        } else{
            int diff = count2 - count1;
            for (int i = 0; i < diff; i++) {
                current2 = current2.next;
            }
        }

        while (!Objects.equals(current1.next, current2.next)){
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1.next;
    }

}
