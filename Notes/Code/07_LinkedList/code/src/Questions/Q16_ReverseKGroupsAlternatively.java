package Questions;

public class Q16_ReverseKGroupsAlternatively {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null){
            return head;
        }
        int length = lengthOfLL(head);
        ListNode current = head;
        ListNode prev = null;
        while (length >= k && current != null){
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
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
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
            length = length - 2*k;
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
