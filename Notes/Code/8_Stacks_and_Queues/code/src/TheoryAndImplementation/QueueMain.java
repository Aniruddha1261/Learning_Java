package TheoryAndImplementation;

import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(3);
        queue.insert(45);
        queue.insert(2);
        queue.insert(98);
        queue.insert(1);
        queue.display();

        System.out.println(queue.remove());
        queue.display();


        CircularQueue que = new CircularQueue(5);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.insert(5);
        que.display();
        System.out.println(que.remove());
        que.insert(6);
        que.display();
    }
}
