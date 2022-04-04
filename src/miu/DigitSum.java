package miu;

public class DigitSum {
    public static void main(String[] args) {

        System.out.println(isDigitSum(-6,6));
    }

    public static int isDigitSum(int n, int m) {
        if (n < 0 || m < 0) return -1;

        if (getDigitSum(n) < m) {
            return 1;
        }
        return 0;

    }

    public static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
