package leetcode.easy;

// Leetcode problem N206
// Related Topic: Linked List, Recursion
//        Given the head of a singly linked list, reverse the list,
//        and return the reversed list.


public class ReverseLinkedList {
    public static void main(String[] args) {

        Solution2 solution2 = new Solution2();

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        ListNode result = solution2.reverseList(node);

        while (result != null){
            System.out.println("Item: "+result.val);
            result = result.next;
        }


    }

    public static class ListNode {
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

    // Iterative approach
    static class Solution1 {
        public ListNode reverseList(ListNode head) {

            if (head == null || head.next == null) {
                return head;
            }

            ListNode newHead = null;

            while (head != null) {
                ListNode temp = head.next;
                head.next = newHead;
                newHead = head;
                head = temp;
            }

            return newHead;
        }
    }

    // Recursive approach
    static class Solution2 {
        public ListNode reverseList(ListNode head){
            if(head == null || head.next == null){
                return head;
            }

            ListNode retNode = reverseList(head.next);

            head.next.next = head;
            head.next = null;
            return retNode;
        }
    }
}
