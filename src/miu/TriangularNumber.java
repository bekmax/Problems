package miu;

public class TriangularNumber {
    public static void main(String[] args) {

        System.out.println(isTriangular(105));
    }

    public static int isTriangular(int n) {
        int sum = 0;
        int j = 0;

        while (sum <= n) {
            if (sum == n) return 1;
            sum += j++;
        }
        return 0;
    }
}
