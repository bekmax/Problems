package miu;

public class Divisible {
    public static void main(String[] args) {

        int[] a = {};
        int divisor = 3;

        System.out.println(isDivisible(a, divisor));
    }

    public static int isDivisible(int[] a, int divisor) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }
}
