package leetcode.easy;

// Leetcode problem N203
// Related Topic: Linked List, Recursion
//        Given the head of a linked list and an integer val,
//        remove all the nodes of the linked list that has Node.val == val,
//        and return the new head.

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        // Test can be implemented here
    }


    public class ListNode {
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

    // Iterative Approach
    class Solution1 {
        public ListNode removeElements(ListNode head, int val) {

            if (head == null) {
                return null;
            }

            ListNode current = head;

            while (current != null) {
                if (current.next.val == val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }

            if (head.val == val) {
                head = head.next;
            }

            return head;

        }
    }
}
