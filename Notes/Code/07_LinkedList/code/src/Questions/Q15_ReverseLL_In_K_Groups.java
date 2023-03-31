package Questions;

import LinkedList.LL;

// Q15: https://leetcode.com/problems/reverse-nodes-in-k-group/
public class Q15_ReverseLL_In_K_Groups {
//    Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
//    k is a positive integer and is less than or equal to the length of the linked list.
//    If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
//    You may not alter the values in the list's nodes, only nodes themselves may be changed.

    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
    }


    // it's also reversing the < k end items -> Modify accordingly  --> Done
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null){
            return head;
        }
        int length = lengthOfLL(head);
        ListNode current = head;
        ListNode prev = null;
        while (length >= k){
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;
            if (current == null){
                break;
            }
            prev = newEnd;
            length = length - k;
        }
        return head;
    }

    public int lengthOfLL(ListNode head){
        int counter = 0;
        ListNode node = head;
        while (node != null){
            node = node.next;
            counter++;
        }
        return counter;
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
