package miu;

public class HodderNumber {
    public static void main(String[] args) {

        System.out.println(isHodderNumber(3));
        System.out.println(isHodderNumber(7));
        System.out.println(isHodderNumber(31));
        System.out.println(isHodderNumber(127));
        System.out.println(isHodderNumber(255));

    }

    public static int isHodderNumber(int n){
        if (isPrime(n)){
            int j = 0;
            int num = 0;

            while (num < n){
                num = (int) Math.pow(2, j++) - 1;
                if (num == n) return 1;
            }
        }
        return 0;
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
