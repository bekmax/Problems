package crackingthecodinginterview.chapter3;

import crackingthecodinginterview.chapter3.data.MyStack;
import crackingthecodinginterview.chapter3.data.Stack;
import crackingthecodinginterview.chapter3.data.Util;

import java.util.EmptyStackException;
import java.util.Objects;

// How would you design a stack which, in addition to push and pop, has a function min which
// returns the minimum element? Push, pop and min should all operate in O(1) time.
public class StackMin<T extends Comparable<T>> implements Stack<T> {

    public static void main(String[] args) {
        Stack<Integer> st = Util.generateStack(new StackMin<Integer>(), 10);
        Util.print(st);

        System.out.println("Min in stack: " + st.min());
        st.pop();
    }


    private static class StackNode<T> {
        private T data;
        private T minSoFar;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T min() {
        if (top == null) throw new EmptyStackException();
        return top.minSoFar;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<>(item);
        if (top == null) {
            t.minSoFar = t.data;
        } else {
            if (top.minSoFar.compareTo(item) > 0) {
                t.minSoFar = item;
            } else {
                t.minSoFar = top.minSoFar;
            }
        }
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
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
        return "[" + sb.toString() + "]";
    }
}
