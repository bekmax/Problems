package miu;

public class LargestAdjacentSum {
    public static void main(String[] args) {

        int[] a = {1,2,1,1,1,1,1,-13};

        System.out.println(largestAdjacentSum(a));
    }

    public static int largestAdjacentSum(int[] a) {
        int sum = a[0] + a[1];

        for (int i = 0; i < a.length - 1; i++) {
            if (sum < a[i] + a[i + 1]) {
                sum = a[i] + a[i + 1];
            }
        }
        return sum;
    }
}
