package miu;

public class ZeroPlentiful {
    public static void main(String[] args) {

        int[] a = {};

        System.out.println(zeroPlentiful(a));
    }

    public static int zeroPlentiful(int[] a) {
        int zeroCount = 0;
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (zeroCount > 0 && zeroCount < 4) return 0;
                zeroCount = 0;
            } else {
                zeroCount++;
            }

            if (zeroCount == 4) {
                result++;
            }
        }
        return result;
    }
}
