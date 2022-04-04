package miu;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(henry(1, 3));
    }

    public static int henry(int i, int j) {
        int number = 0;
        int count = 0;
        int sum = 0;
        int limit = i > j ? i : j;
        while (count <= limit) {
            number++;
            while (!isPerfectNumber(number)) {
                number++;
            }
            count++;
            if (count == i || count == j) {
                System.out.println(number);
                sum += number;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int n) {
        int sumOfFactors = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfFactors += i;
            }
        }
        return sumOfFactors == n;
    }
}
