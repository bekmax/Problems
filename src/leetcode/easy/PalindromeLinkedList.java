package leetcode.easy;

// Leetcode problem N234
// Related Topics: Linked List, Two Pointers, Stack, Recursion
//      Given the head of a singly linked list, return true if it is a palindrome.

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        // Test can be implemented here
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Using Stack data structure
    static class Solution1 {
        public boolean isPalindrome(ListNode head){
            Stack<Integer> stack = new Stack<Integer>();
            ListNode temp = head;

            while (temp != null){
                stack.push(temp.val);
                temp = temp.next;
            }

            while (head != null){
                if (head.val != stack.pop()){
                    return false;
                }
                head = head.next;
            }
            return true;
        }
    }
}
