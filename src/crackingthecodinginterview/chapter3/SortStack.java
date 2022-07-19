package crackingthecodinginterview.chapter3;

// Write a program to sort a stack such that the smallest items are on the top.
// You can use an additional temporary stack, but you may not copy the elements into
// any other data structure.
// The stack supports the following operations: push, pop, peek, isEmpty

import crackingthecodinginterview.chapter3.data.MyStack;

public class SortStack<T> {
    public static void main(String[] args) {
        SortStack<Integer> st = new SortStack<>();
        MyStack<Integer> myStack = new MyStack<Integer>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(5);
        myStack.push(4);
        System.out.println(myStack);
        System.out.println(st.sortStack(myStack));
    }

    public <T extends Comparable<? super T>> MyStack<T> sortStack(MyStack<T> stack) {
        MyStack<T> sortedStack = new MyStack<T>();
        boolean stackPop = false;
        while (!stack.isEmpty()) {
            if (sortedStack.isEmpty()) {
                sortedStack.push(stack.pop());
            } else {
                MyStack<T> utilStack = new MyStack<>();
                while (!sortedStack.isEmpty()) {
                    if (sortedStack.peek().compareTo(stack.peek()) >= 0) {
                        sortedStack.push(stack.pop());
                        stackPop = true;
                        break;
                    } else {
                        utilStack.push(sortedStack.pop());
                        stackPop = false;
                    }
                }

                if (!stackPop && !stack.isEmpty()) {
                    sortedStack.push(stack.pop());
                }

                while (!utilStack.isEmpty()) {
                    sortedStack.push(utilStack.pop());
                }
            }
        }

        return sortedStack;
    }


}
