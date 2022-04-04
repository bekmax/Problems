package miu;

public class LargestPrimeFactor {
    public static void main(String[] args) {

        System.out.println(largestPrimeFactor(1));
    }

    public static int largestPrimeFactor(int n){
        if (n <= 1) return 0;
        int primeFactor = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0){
                if (isPrime(i)){
                    primeFactor = i;
                }
            }
        }

        return primeFactor;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
