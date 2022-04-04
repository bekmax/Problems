package miu;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(36));
    }

    public static int isPerfectSquare(int n) {
        if (n < 0) return 0;

        int number = (int) Math.sqrt(n) + 1;

        return number * number;
    }
}
