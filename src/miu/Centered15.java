package miu;

public class Centered15 {
    public static void main(String[] args) {

        int[] a = {3, 2, 10, 5, 1, 6, 9};

        System.out.println(isCentered15(a));
    }

    public static int isCentered15(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += a[i];
            }
            if (sum == 15) return 1;
            start++;
            end--;
        }
        return 0;
    }
}
