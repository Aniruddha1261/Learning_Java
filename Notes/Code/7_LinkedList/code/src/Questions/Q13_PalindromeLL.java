package Questions;

import LinkedList.LL;

import java.util.IllegalFormatCodePointException;

// Q13: https://leetcode.com/problems/palindrome-linked-list/
// Linkedin, Google, Facebook, Microsoft, Amazon, Apple
public class Q13_PalindromeLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        list.display();
    }

    public boolean isPalindrome(ListNode head){
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode re_reverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null){
            if (head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(re_reverseHead);

        if (head == null || headSecond == null){
            return true;
        }
        return false;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        if(present == null){
            return head;
        }
        ListNode next = present.next;


        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next = next.next;
            }
            head = prev;
        }
        return head;
    }

    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
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
