package Questions;

public class Q1 {

    public static void main(String[] args) {
        LinkedList.LL list = new LinkedList.LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insert(100, 2);
        list.display();

        list.insertRecursion(88, 2);
        list.display();
    }

}
