package miu;

public class PrimeHappy {
    public static void main(String[] args) {

        System.out.println(isPrimeHappy(8));
    }

    public static int isPrimeHappy(int n) {
        int primeSum = 0;

        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeSum += i;
            }
        }

        return primeSum % n == 0 ? 1 : 0;
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
