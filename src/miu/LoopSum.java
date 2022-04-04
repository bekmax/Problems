package miu;

public class LoopSum {
    public static void main(String[] args) {

        int[] a = {-1, 2, -1};

        System.out.println(loopSum(a, 7));
    }

    public static int loopSum(int[] a, int n) {
        int sum = 0;
        int loopLimit = 0;
        while (n > 0) {
            if (n >= a.length) {
                loopLimit = a.length;
                n = n - a.length;
            } else {
                loopLimit = n;
                n = n / a.length;
            }

            for (int i = 0; i < loopLimit; i++) {
                sum += a[i];
            }
        }

        return sum;
    }
}
