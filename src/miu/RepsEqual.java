package miu;

public class RepsEqual {
    public static void main(String[] args) {

        int[] a = {2, 3, 0, 5, 3};
        int n = 32053;

        System.out.println(repsEqual(a, n));
    }

    public static int repsEqual(int[] a, int n) {
        int index = a.length - 1;
        while (index >= 0) {
            int digit = n % 10;
            n /= 10;

            if (a[index--] != digit) {
                return 0;
            }
        }
        return 1;
    }
}
