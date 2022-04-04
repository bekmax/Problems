package miu;

import java.util.Arrays;

public class SequentiallyBounded {
    public static void main(String[] args) {

        int[] a = {2, 3, 3, 99, 99, 99, 99, 99};
        System.out.println(isSequentiallyBounded(a));
    }

    public static int isSequentiallyBounded(int[] a) {
        if (a.length == 0) return 1;

        if (isValidArray(a)) {
            int[] arr = new int[a[a.length - 1]];

            for (int n : a) {
                arr[n - 1]++;
            }

            for (int i = 0; i < arr.length; i++) {
                if (i + 1 <= arr[i]) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static boolean isValidArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] <= 0 || a[i] <= 0) {
                return false;
            }
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }
}
