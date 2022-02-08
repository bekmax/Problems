package leetcode.easy;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Using extra space
    static class Solution1 {
        public ListNode middleNode(ListNode head) {
            ListNode[] arr = new ListNode[100];

            int i = 0;
            while(head != null){
                arr[i++] = head;
                head = head.next;
            }

            return arr[i/2];
        }
    }

    // Using Two Pointers
    static class Solution2 {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
