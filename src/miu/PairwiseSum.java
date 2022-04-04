package miu;

public class PairwiseSum {
    public static void main(String[] args) {

        int[] a = {2, 1, 18, -5, -5, -15, 0, 0, 1, -1};
        int[] res = pairwiseSum(a);

        if (res != null) {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
        }
    }

    public static int[] pairwiseSum(int[] a) {
        if (a.length == 0 || a.length % 2 != 0) return null;

        int[] result = new int[a.length / 2];

        for (int i = 0; i < result.length; i++) {
            result[i] = a[2 * i] + a[2 * i + 1];
        }
        return result;
    }
}
