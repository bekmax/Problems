package miu;

import java.util.Arrays;

public class HasNValues {
    public static void main(String[] args) {

        int[] a = {1, 1, 1, 8, 1, 1, 1, 3, 5};

        System.out.println(hasNValues(a, 4));
    }

    public static int hasNValues(int[] a, int n) {
        int[] arr = Arrays.copyOf(a, a.length);
        Arrays.sort(arr);
        int num = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                num++;
            }
        }

        return num + 1 == n ? 1 : 0;
    }
}
