package miu;

public class PrimeCount {
    public static void main(String[] args) {

        System.out.println(primeCount(11, 29));
    }

    public static int primeCount(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
