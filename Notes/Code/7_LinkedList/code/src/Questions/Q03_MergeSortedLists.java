package Questions;
//Q3: https://leetcode.com/problems/merge-two-sorted-lists/
import LinkedList.LL;

public class Q03_MergeSortedLists {
    public static void main(String[] args) {
        LinkedList.LL list1 = new LinkedList.LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        list1.insertLast(5);
        list1.display();

        LinkedList.LL list2 = new LinkedList.LL();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(6);
        list2.insertLast(9);
        list2.display();


        LL list3 = LL.merge(list1, list2);
        list3.display();

    }
}
