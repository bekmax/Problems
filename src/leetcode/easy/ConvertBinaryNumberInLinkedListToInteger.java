package leetcode.easy;

// Leetcode Problem N1290
// Related Topic: Linked List, Math
//        Given head which is a reference node to a singly-linked list.
//        The value of each node in the linked list is either 0 or 1.
//        The linked list holds the binary representation of a number.
//        Return the decimal value of the number in the linked list.

public class ConvertBinaryNumberInLinkedListToInteger {
    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public int getDecimalValue(ListNode head) {

            int result = head.val;

            while(head.next != null){
                result = result * 2 + head.next.val;
                //result = (result << 1) | head.next.val;
                head = head.next;
            }

            return result;
        }
    }
}
