package crackingthecodinginterview.chapter3;

import crackingthecodinginterview.chapter3.data.MyStack;
import crackingthecodinginterview.chapter3.data.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackOfPlates<T> implements Stack<T> {
    public static void main(String[] args) {
        StackOfPlates<Integer> plates = new StackOfPlates<>(3);
        plates.push(1);
        plates.push(2);
        plates.push(3);
        plates.push(4);
        plates.push(5);
        plates.push(6);
        plates.push(7);

        plates.print();
        System.out.println();
        System.out.println(plates.popAt(2));
        System.out.println(plates.popAt(2));
        System.out.println();
        plates.print();
    }


    private final Integer capacity;

    public StackOfPlates(Integer capacity) {
        this.capacity = capacity;
    }

    List<MyStack<T>> nodes = new ArrayList<>();

    @Override
    public void push(T item) {
        if (nodes.isEmpty()) {
            MyStack<T> stack = new MyStack<>();
            stack.push(item);
            nodes.add(stack);
        } else {
            MyStack<T> stack = nodes.get(nodes.size() - 1);
            if (stack.count() < capacity) {
                stack.push(item);
            } else {
                stack = new MyStack<>();
                stack.push(item);
                nodes.add(stack);
            }
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        MyStack<T> stack = nodes.get(nodes.size() - 1);
        T data = stack.pop();

        if (stack.isEmpty()) {
            nodes.remove(stack);
        }
        return data;
    }

    public T popAt(int index) {
        if (isEmpty()) throw new EmptyStackException();
        if (index > nodes.size()) throw new EmptyStackException();
        MyStack<T> stack = nodes.get(index - 1);
        T data = stack.pop();

        if (stack.isEmpty()) {
            nodes.remove(stack);
        }
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        MyStack<T> stack = nodes.get(nodes.size() - 1);

        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return nodes.isEmpty();
    }


    public void print() {
        for (MyStack<T> item : nodes) {
            System.out.println(item.toString());
        }
    }
}
