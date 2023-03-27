package TheoryAndImplementation;

import java.util.*;

public class InBuildImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(8);
        deque.addLast(12);
        System.out.println(deque.removeFirst());
        // etc etc

    }
}