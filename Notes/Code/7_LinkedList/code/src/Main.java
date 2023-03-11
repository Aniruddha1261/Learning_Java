public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 2);
        list.display();
        System.out.println(list.deleteFirst() + " is deleted.");
        list.display();
        System.out.println(list.deleteLast() + " is deleted.");
        list.display();
        System.out.println(list.delete(2) + " is deleted.");
        list.display();
    }
}