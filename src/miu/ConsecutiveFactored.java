package miu;

public class ConsecutiveFactored {
    public static void main(String[] args) {

        System.out.println(isConsecutiveFactored(24));
    }

    public static int isConsecutiveFactored(int n) {
        if (n <= 0) {
            return 0;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1;
            }
        }
        return 0;
    }
}
