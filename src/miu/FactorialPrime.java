package miu;

public class FactorialPrime {
    public static void main(String[] args) {

        System.out.println(isFactorialPrime(121));

    }

    public static int isFactorialPrime(int n) {
        if (isPrime(n)) {
            if (isFactorial(n - 1)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isFactorial(int num) {
        int i = 1;
        while (num > 1){
            num /= i;
            i++;
        }
        return num == 1 ? true : false;
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
