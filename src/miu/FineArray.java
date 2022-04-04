package miu;

public class FineArray {
    public static void main(String[] args) {

        int[] a = {4, 19, 6, 30, 17};

        System.out.println(isFineArray(a));
    }

    public static int isFineArray(int[] a) {

        for (int j : a) {
            boolean olderTwin = false;
            boolean youngerTwin = false;
            if (isPrime(j)) {
                if (isPrime(j - 2) && numberExistInArray(a, j - 2)) {
                    youngerTwin = true;
                }
                if (isPrime(j + 2) && numberExistInArray(a, j + 2)) {
                    olderTwin = true;
                }

                if (!(youngerTwin || olderTwin)) return 0;
            }
        }
        return 1;
    }

    public static boolean numberExistInArray(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
