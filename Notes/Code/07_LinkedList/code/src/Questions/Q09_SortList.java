package Questions;

import LinkedList.LL;

// Q9: https://leetcode.com/problems/sort-list/submissions/
public class Q09_SortList {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertLast(5);
        list1.insertLast(4);
        list1.insertLast(3);
        list1.insertLast(2);
        list1.insertLast(1);
        list1.display();
        // Solve Using Bubble Sort
        list1.bubbleSort();
        list1.display();
    }

    // Solve using merge OSrt
    public ListNode mergeSort(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = getMiddle(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    public ListNode getMiddle(ListNode head){
        ListNode midPrev = null;

        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int x) {
            this.val = x;
            this.next = null;
        }
    }
}
