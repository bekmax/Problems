package miu;

public class SumSafe {
    public static void main(String[] args) {

        int[] a = {5, -2, 1};

        System.out.println(isSumSafe(a));
    }

    public static int isSumSafe(int[] a) {
        int sum = 0;

        for (int i : a) {
            sum += i;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                return 0;
            }
        }
        return 1;
    }
}
