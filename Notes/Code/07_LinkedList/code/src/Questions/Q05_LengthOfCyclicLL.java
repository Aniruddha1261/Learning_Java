package Questions;
// Q5: Find the length of the cycle
// Amazon and Microsoft Questions
public class Q05_LengthOfCyclicLL {
    private class ListNode{

        private int val;
        private Q05_LengthOfCyclicLL.ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

//        public ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
    }

    // Find length of LL Cycle
    public int LengthCycle(Q05_LengthOfCyclicLL.ListNode head) {
        Q05_LengthOfCyclicLL.ListNode fast = head;
        Q05_LengthOfCyclicLL.ListNode slow = head;

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


    public static void main(String[] args) {
    }
}
