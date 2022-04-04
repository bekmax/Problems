package miu;

public class NPrimeable {
    public static void main(String[] args) {

        int[] a = {5, 15, 27};

        System.out.println(nPrimeable(a, 2));
    }

    public static int nPrimeable(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (!isPrime(a[i] + n)) return 0;
        }
        return 1;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
