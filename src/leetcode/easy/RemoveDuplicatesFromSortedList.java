package leetcode.easy;

// Leetcode Problem N83
// Related Topic: Linked List
//        Given the head of a sorted linked list,
//        delete all duplicates such that each element appears only once.
//        Return the linked list sorted as well.

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode list = new ListNode(2);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(5);

        ListNode result = solution.deleteDuplicates(list);

        printList(result);
    }

    public static void printList(ListNode node){
        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;

            if(current == null){
                return null;
            }
            while (current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                }else{
                    current = current.next;
                }
            }
            return head;
        }
    }
}
