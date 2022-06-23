package crackingthecodinginterview.chapter2;

// Implement a function to check if a linked list is a palindrome

import crackingthecodinginterview.chapter2.data.Node;
import crackingthecodinginterview.chapter2.data.Util;

import java.util.Objects;

public class Palindrome {
    public static void main(String[] args) {

        Node list = Util.loadData(5);
        long count = 1;
        while (!isPalindrome(list)){
            Util.print(list);
            System.out.println(isPalindrome(list));
            list = Util.loadData(5);
            count++;
        }
        Util.print(list);
        System.out.println(isPalindrome(list));
        System.out.println(count);

    }

    public static boolean isPalindrome(Node head){
        Node reversedHead = null;
        Node current = head;

        while (current != null){
            Node node = new Node(current.data);
            if (reversedHead != null) {
                node.next = reversedHead;
            }
            reversedHead = node;
            current = current.next;
        }

        current = head;
        Node reverseCurrent = reversedHead;
        while (current != null){
            if (!Objects.equals(current.data, reverseCurrent.data)) return false;
            current = current.next;
            reverseCurrent = reverseCurrent.next;
        }

        return true;
    }
}
