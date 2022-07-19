package leetcode.medium;

// Leetcode Problem N155
// Related Topic: Stack, Design.
//        Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//        Implement the MinStack class:
//        MinStack() initializes the stack object.
//        void push(int val) pushes the element val onto the stack.
//        void pop() removes the element on the top of the stack.
//        int top() gets the top element of the stack.
//        int getMin() retrieves the minimum element in the stack.

public class MinStack {
    public static void main(String[] args) {
        MinStack meanStack = new MinStack();
        meanStack.push(-2);
        meanStack.push(0);
        meanStack.push(-1);

        System.out.println(meanStack.getMin());
        System.out.println(meanStack.top());
        //System.out.println(meanStack.pop());
        System.out.println(meanStack.getMin());
    }

    private class Node {
        private int data;
        private int min;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public MinStack() {

    }

    public void push(int val) {
        Node node = new Node(val);
        if (top == null) {
            node.min = val;
        } else {
            if (top.min > val) {
                node.min = val;
            } else {
                node.min = top.min;
            }
        }
        node.next = top;
        top = node;
    }

    public void pop() {
        if (top == null) return;
        top = top.next;
    }

    public int top() {
        if (top == null) return 0;
        return top.data;
    }

    public int getMin() {
        if (top == null) return 0;
        return top.min;
    }

}
