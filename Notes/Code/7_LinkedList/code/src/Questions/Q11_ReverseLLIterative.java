package Questions;

import LinkedList.LL;

public class Q11_ReverseLLIterative {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        list.ipreverse();
        list.display();
    }
}
