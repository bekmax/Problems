package miu;

public class Is235Array {
    public static void main(String[] args) {

        int[] a = {2,3,6,7,11};

        System.out.println(is235Array(a));
    }

    public static int is235Array(int[] a) {
        int sum = 0;

        for (int number : a) {
            if (isDivisible(number, 2)) sum++;
            if (isDivisible(number, 3)) sum++;
            if (isDivisible(number, 5)) sum++;
            if (!isDivisible(number, 2)
                    && !isDivisible(number, 3)
                    && !isDivisible(number, 5)) {
                sum++;
            }
        }

        if (sum == a.length) return 1;
        return 0;
    }

    public static boolean isDivisible(int num, int divider) {
        return num % divider == 0;
    }
}
