package miu;

public class CompleteArray {
    public static void main(String[] args) {

        int[] a = {36, -28};

        System.out.println(isCompleteArray(a));
    }

    public static int isCompleteArray(int[] a) {
        boolean evenNumExists = false;
        boolean squareNumExists = false;
        boolean sum8Exists = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) evenNumExists = true;
            if (isSquare(a[i])) squareNumExists = true;

            if (evenNumExists && squareNumExists) break;
        }

        if (!evenNumExists || !squareNumExists) return 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    sum8Exists = true;
                    break;
                }
            }
        }

        return sum8Exists ? 1 : 0;
    }

    public static boolean isSquare(int n) {
        if (n < 0) return false;

        for (int i = 0; i <= n; i++) {
            if (i * i == n) return true;
        }
        return false;
    }
}
