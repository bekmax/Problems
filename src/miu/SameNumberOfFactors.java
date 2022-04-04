package miu;

public class SameNumberOfFactors {
    public static void main(String[] args) {

        System.out.println(sameNumberOfFactors(8,12));
    }

    public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) return -1;

        if (numberOfFactors(n1) == numberOfFactors(n2)) return 1;
        return 0;
    }

    public static int numberOfFactors(int n) {
        int num = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) num++;
        }
        return num;
    }
}
