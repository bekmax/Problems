package miu;

public class MagicArray {
    public static void main(String[] args) {

        int[] a = {0, 9, 12, 4, 6};

        System.out.println(isMagicArray(a));
    }

    public static int isMagicArray(int[] a) {
        int primeSum = 0;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) primeSum += a[i];
        }

        return a[0] == primeSum ? 1 : 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
