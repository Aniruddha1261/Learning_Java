package Questions;

import LinkedList.LL;

// Q2: Remove Duplicates from Sorted List
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class Q02_RemoveDuplicate {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.duplicates();
        list.display();

    }
}
