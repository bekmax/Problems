package miu;

public class PairedN {
    public static void main(String[] args) {

        int[] a = {};

        System.out.println(pairedN(a, 0));
    }

    public static int pairedN(int[] a, int n) {
        if (n > 2 * a.length - 1) return 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == i + j) return 1;
            }
        }
        return 0;
    }
}
