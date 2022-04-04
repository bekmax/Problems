package miu;

public class CheckConcatenatedSum {
    public static void main(String[] args) {

        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    public static int checkConcatenatedSum(int n, int catlen) {
        int sum = 0;
        int num = n;
        while (num > 0) {
            int digit = num % 10;
            int partSum = 0;
            int len = catlen;
            while (len > 0) {
                partSum = partSum * 10 + digit;
                len--;
            }
            sum += partSum;
            num /= 10;
        }

        if (n == sum) return 1;
        return 0;
    }
}
