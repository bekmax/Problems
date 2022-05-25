package leetcode.medium;

// Leetcode Problem N2
// Related Topic: LinkedList, Math, Recursion
//        You are given two non-empty linked lists representing two non-negative integers.
//        The digits are stored in reverse order, and each of their nodes contains a single digit.
//        Add the two numbers and return the sum as a linked list.
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode resultHead = new ListNode();
            ListNode current = resultHead;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int digit1 = l1 != null ? l1.val : 0;
                int digit2 = l2 != null ? l2.val : 0;

                int sum = digit1 + digit2 + carry;
                carry = 0;

                if (sum < 10) {
                    current.val = sum;
                } else {
                    carry = sum / 10;
                    current.val = sum % 10;
                }

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;

                if (l1 == null && l2 == null) {
                    current.next = null;
                } else {
                    current.next = new ListNode();
                    current = current.next;
                }
            }
            if (carry != 0) {
                current.next = new ListNode(carry);
            }
            return resultHead;
        }
    }

}

