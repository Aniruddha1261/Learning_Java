package Questions;
// Q14: https://leetcode.com/problems/reorder-list/

//You are given the head of a singly linked-list. The list can be represented as:
//
//        L0 → L1 → … → Ln - 1 → Ln
//        Reorder the list to be on the following form:
//
//        L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//        You may not modify the values in the list's nodes. Only nodes themselves may be changed.
//

import java.util.List;

public class Q14_ReorderList {


    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null){
            hf.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        if (present == null) {
            return head;
        }
        ListNode next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
            head = prev;
        }
        return head;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
}
