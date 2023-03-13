public class Main {
    public static void main(String[] args) {
        // Singly Linked List
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(100, 2);
//        list.display();
//        System.out.println(list.deleteFirst() + " is deleted.");
//        list.display();
//        System.out.println(list.deleteLast() + " is deleted.");
//        list.display();
//        System.out.println(list.delete(2) + " is deleted.");
//        list.display();

        // Doubly Linked List
        DLL list2 = new DLL();
        list2.insertFirst(5);
        list2.insertFirst(8);
        list2.insertFirst(7);
        list2.insertFirst(3);
        list2.insertLast(10);
        list2.insertAfter(10, 55);
        list2.display();
    }
}