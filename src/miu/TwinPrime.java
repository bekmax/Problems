package miu;

public class TwinPrime {
    public static void main(String[] args) {

        System.out.println(isTwinPrime(53));
    }

    public static int isTwinPrime(int n) {
        if (isPrime(n)) {
            if (isPrime(n - 2) || isPrime(n + 2)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
