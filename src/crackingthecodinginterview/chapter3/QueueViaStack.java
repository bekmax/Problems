package crackingthecodinginterview.chapter3;

// Implement MyQueue class which implements a queue using two stacks

import crackingthecodinginterview.chapter3.data.MyStack;


public class QueueViaStack<T> {
    private MyStack<T> stack;
    private MyStack<T> utilStack;

    public QueueViaStack() {
        stack = new MyStack<T>();
    }

    public void add(T value) {
        stack.push(value);
    }

    public T poll() {
        if (stack.isEmpty()) {
            return null;
        }

        utilStack = new MyStack<T>();
        while (stack.hasNext()) {
            utilStack.push(stack.pop());
        }

        T returnValue = stack.pop();

        while (!utilStack.isEmpty()) {
            stack.push(utilStack.pop());
        }
        return returnValue;
    }

    public T peek() {
        utilStack = new MyStack<T>();
        if (stack.isEmpty()) {
            return null;
        }

        while (stack.hasNext()) {
            utilStack.push(stack.pop());
        }

        T returnValue = stack.peek();

        while (!utilStack.isEmpty()) {
            stack.push(utilStack.pop());
        }
        return returnValue;
    }

    public static void main(String[] args) {
        QueueViaStack<Integer> myQueue = new QueueViaStack<Integer>();
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);

        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }

}
