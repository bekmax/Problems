package miu;

public class FullnessQuotient {
    public static void main(String[] args) {

        System.out.println(fullnessQuotient(94));
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }

    public static int fullnessQuotient(int n) {
        if (n < 1) return -1;
        int fullnessQuotient = 0;
        for (int i = 2; i < 10; i++) {
            int num = convertToBase(n, i);

            if (!containsZero(num)) {
                fullnessQuotient++;
            }
        }
        return fullnessQuotient;
    }

    public static boolean containsZero(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) return true;
            num /= 10;
        }
        return false;
    }

    public static int convertToBase(int number, int base) {
        int result = 0;
        int degree = 1;
        while (number != 0) {
            result = result + (number % base) * degree;
            degree *= 10;
            number /= base;
        }
        return result;
    }
}
