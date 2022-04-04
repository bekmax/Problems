package miu;

public class NormalNumber {
    public static void main(String[] args) {

        System.out.println(isNormal(29));
    }

    public static int isNormal(int n) {
        if (n == 1) return 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0 && i % 2 != 0) return 0;
        }
        return 1;
    }
}
