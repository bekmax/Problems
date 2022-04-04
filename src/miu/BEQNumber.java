package miu;

public class BEQNumber {
    public static void main(String[] args) {

        System.out.println(findSmallestBEQNumber());
    }

    public static int findSmallestBEQNumber() {
        int n = 1;
        while (!hasFourSixes(n * n * n)) {
            n++;
        }

        return n;
    }

    public static boolean hasFourSixes(int num) {
        int numOf6s = 0;

        while (num > 0) {
            if (num % 10 == 6) numOf6s++;
            if (numOf6s > 4) return false;
            num /= 10;
        }

        return numOf6s == 4;
    }
}
