package miu;

import java.util.Arrays;

public class TrivalentArray {
    public static void main(String[] args) {

        int[] a = {22, 19, 10, 10, 19, 21, 22, 10};

        System.out.println(isTrivalent(a));
    }

    public static int isTrivalent(int[] a) {
        int count = 0;
        int num = a[0];

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (num != a[i]) {
                count++;
                num = a[i];
            }
        }
        if (count == 3) return 1;
        return 0;
    }
}
