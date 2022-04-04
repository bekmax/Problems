package miu;

public class ZeroBalanced {
    public static void main(String[] args) {

        int[] a = {-5,2,3};

        System.out.println(isZeroBalanced(a));
    }

    public static int isZeroBalanced(int[] a) {
        if (a.length == 0) return 0;

        int sum = 0;
        for (int i : a) sum += i;
        if (sum != 0) return 0;

        for (int j : a) {
            if (j > 0) {
                if (!numberExistsInArray(a, -j)) return 0;
            }
        }
        return 1;
    }

    public static boolean numberExistsInArray(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) return true;
        }
        return false;
    }

}
