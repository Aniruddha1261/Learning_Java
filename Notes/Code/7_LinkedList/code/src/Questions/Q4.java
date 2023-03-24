package Questions;

import LinkedList.LL;

// Q4: https://leetcode.com/problems/linked-list-cycle/
public class Q4 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    private class ListNode{

        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

//        public ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
    }



        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow){
                    return true;
                }
            }
            return false;
        }


    public static void main(String[] args) {
    }
}
