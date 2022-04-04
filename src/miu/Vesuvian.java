package miu;

public class Vesuvian {
    public static void main(String[] args) {

        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(52));
    }

    public static int isVesuvian(int n) {

        for (int i = 1; i < n; i++) {
            if (isSquare(i) && isSquare(n - i)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isSquare(int num) {
        int i = 1;
        while (i * i < num) {
            i++;
        }
        return i * i == num;
    }
}
