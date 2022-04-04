package miu;

public class GetExponent {
    public static void main(String[] args) {

        System.out.println(getExponent(162, 3));
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(-250, 5));
    }

    public static int getExponent(int n, int p) {
        if (p <= 1) return -1;

        int exp = 0;

        while (n % p == 0) {
            n = n / p;
            exp++;
        }
        return exp;
    }
}
