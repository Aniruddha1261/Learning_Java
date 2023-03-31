package InterviewQuestions;
// Q1: https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.Stack;

public class O1_ImplementQueueUsingStacks {
    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(5);
//        System.out.println(stack.pop());
        MyQueue obj = new MyQueue();
        obj.push(3);
        int param_3 = obj.peek();
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
        System.out.println(param_3);
        System.out.println(param_2);
        System.out.println(param_4);
    }
}

class MyQueue {
    // Insert Efficient
    private Stack<Integer> first;
    private Stack<Integer> second;


    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.empty();
    }
}


class MyQueue2 {
    // Remove Efficient
    private Stack<Integer> first;
    private Stack<Integer> second;


    public MyQueue2() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        while (!first.empty()) {
            second.push(first.pop());
        }
        first.push(x);
        while (!second.empty()) {
            first.push(second.pop());
        }
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean empty() {
        return first.empty();
    }
}