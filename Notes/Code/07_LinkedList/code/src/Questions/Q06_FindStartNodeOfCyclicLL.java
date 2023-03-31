package Questions;

// Q6: https://leetcode.com/problems/linked-list-cycle-ii/
public class Q06_FindStartNodeOfCyclicLL {
    public static void main(String[] args) {

    }


    public ListNode detectCycle(ListNode head){
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                length = LengthCycle(slow);
                break;
            }
        }

        if (length == 0){
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0){
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while(f != s){
            f = f.next;
            s = s.next;
        }

        return s;
    }


    public int LengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                //calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != fast);
                return length;
            }
        }
        return 0;
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
