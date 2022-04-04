package miu;

import java.util.Arrays;

public class ComputeDepth {
    public static void main(String[] args) {

        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }

    public static int computeDepth(int n) {
        int[] arr = new int[10];
        Arrays.fill(arr, 0);

        int depth = 1;

        while (!isComplete(arr)) {
            int number = n * depth++;
            while (number != 0) {
                int index = number % 10;
                arr[index]++;
                number /= 10;
            }
        }
        return depth - 1;
    }

    public static boolean isComplete(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) return false;
        }
        return true;
    }
}
