package leetcode.easy;

// Leetcode problem N160
// Related Topic: Linked List, Hash Table, Two Pointer
//        Given the heads of two singly linked-lists headA and headB,
//        return the node at which the two lists intersect.
//        If the two linked lists have no intersection at all, return null.

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        // Test can be implemented here
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

//  Using HashSet. Time Complexity O(N), Space Complexity O(N)
    static class Solution1 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null) return headB;
            if (headB == null) return headA;

            HashSet<ListNode> set = new HashSet<>();

            while (headA != null) {
                set.add(headA);
                headA = headA.next;
            }

            while (headB != null) {
                if (set.contains(headB)) {
                    return headB;
                }
                headB = headB.next;
            }
            return null;
        }
    }

//  Iterative Approach: Time Complexity O(N), Space Complexity O(1)
    static class Solution2 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null) return null;

            int aCount = getCount(headA);
            int bCount = getCount(headB);

            if(aCount > bCount){
                int d = aCount - bCount;
                return getIntersection(d, headA, headB);
            } else{
                int d = bCount - aCount;
                return getIntersection(d, headB, headA);
            }

        }

        public ListNode getIntersection(int d, ListNode A, ListNode B){
            for(int i=0; i<d; i++){
                A = A.next;
            }

            while(A != null && B != null){
                if(A == B){
                    return A;
                }
                A = A.next;
                B = B.next;
            }
            return null;
        }

        public int getCount(ListNode node){
            int count = 0;

            while(node!=null){
                count++;
                node = node.next;
            }
            return count;
        }
    }
}
