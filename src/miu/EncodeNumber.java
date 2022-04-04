package miu;

public class EncodeNumber {
    public static void main(String[] args) {

        int[] result = encodeNumber(21);

        if (result != null){
            for (int i : result) {
                System.out.print(i + " ");
            }
        }
        else{
            System.out.println(result);
        }
    }

    public static int[] encodeNumber(int n) {
        if (n <= 1) return null;

        int[] result = new int[getArrayLength(n)];
        int count = 0;
        int factor = 2;
        while (n > 1) {
            if (n % factor == 0) {
                result[count++] = factor;
                n /= factor;
            } else {
                factor = getNextPrime(factor);
            }
        }
        return result;
    }

    public static int getArrayLength(int n) {
        int count = 0;
        int factor = 2;
        while (n > 1) {
            if (n % factor == 0) {
                count++;
                n /= factor;
            } else {
                factor = getNextPrime(factor);
            }
        }
        return count;
    }

    public static int getNextPrime(int num) {
        num++;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
