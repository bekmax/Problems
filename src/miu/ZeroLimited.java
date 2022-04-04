package miu;

public class ZeroLimited {
    public static void main(String[] args) {

        int[] a = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0};

        System.out.println(isZeroLimited(a));
    }

    public static int isZeroLimited(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                if ((i - 1) % 3 != 0) return 0;
            }
        }
        return 1;
    }
}
