package crackingthecodinginterview.chapter3.data;

import java.util.EmptyStackException;

public class MyStack<T> implements Stack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;
    private int count;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        count--;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<>(item);
        t.next = top;
        top = t;
        count++;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int count(){
        return count;
    }

    public boolean hasNext(){
        if (isEmpty()) {
            return false;
        }
        return top.next != null;
    }
    @Override
    public String toString() {
        StackNode<T> current = top;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append("\t ");
            }
            current = current.next;
        }
        return "["+sb.toString()+"]";
    }
}
