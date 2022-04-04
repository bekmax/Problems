package miu;

public class StantonMeasure {
    public static void main(String[] args) {

        int[] a = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        System.out.println(stantonMeasure(a));
    }

    public static int stantonMeasure(int[] a) {
        int count1s = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) count1s++;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == count1s) count++;
        }
        return count;
    }
}
