package leetcode.easy;

public class LinkedListCycle {
    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = list.next;

        System.out.println(solution.hasCycle(list));
    }

    static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public static class Solution {
        public boolean hasCycle(ListNode head) {

            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if(fast == slow) return true;
            }
            return false;
        }
    }
}
