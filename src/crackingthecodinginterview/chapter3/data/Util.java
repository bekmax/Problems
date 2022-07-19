package crackingthecodinginterview.chapter3.data;

import java.util.Objects;

public class Util {

    public static Stack<Integer> generateStack(Stack<Integer> myStack, int count){
        for (int i = 0; i < count; i++) {
            myStack.push((int) (Math.random() * 100));
        }
        return myStack;
    }

    public static MyQueue<Integer> generateQueue(int count){
        MyQueue<Integer> myQueue = new MyQueue<>();

        for (int i = 0; i < count; i++) {
            myQueue.add((int) (Math.random() * 100));
        }

        return myQueue;
    }

    public static void print(Object obj){
        System.out.println(obj.toString());
    }
}
