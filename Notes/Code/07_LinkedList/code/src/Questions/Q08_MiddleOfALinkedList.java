package Questions;

public class Q08_MiddleOfALinkedList {
    // use fast and slow pointer method

    public static void main(String[] args) {

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
}
