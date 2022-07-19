package crackingthecodinginterview.chapter3;


import java.util.EmptyStackException;

// Describe how you could use a single array to implement three stacks
public class ThreeInOne {
    public static void main(String[] args) {

    }

    public static class FixedMultiStack {
        private final int numOfStacks = 3;
        private final int stackCapacity;
        private int[] values;
        private int[] sizes;

        public FixedMultiStack(int stackCapacity) {
            this.stackCapacity = stackCapacity;
            values = new int[stackCapacity * numOfStacks];
            sizes = new int[numOfStacks];
        }

        public void push(int stackNum, int item) throws FullStackException {
            if (isFull(stackNum)) throw new FullStackException();

            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = item;
        }

        public int pop(int stackNum) {
            if (isEmpty(stackNum)) throw new EmptyStackException();
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }

        public int peek(int stackNum) {
            if (isEmpty(stackNum)) throw new EmptyStackException();
            return values[indexOfTop(stackNum)];
        }

        public boolean isEmpty(int stackNum) {
            return sizes[stackNum] == 0;
        }

        public boolean isFull(int stackNum) {
            return sizes[stackNum] == stackCapacity;
        }

        public int indexOfTop(int stackNum) {
            int offset = stackNum * stackCapacity;
            int size = sizes[stackNum];
            return offset + size - 1;
        }

        private class FullStackException extends Exception {

        }
    }
}
