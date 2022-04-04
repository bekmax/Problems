package miu;

public class VanillaArray {
    public static void main(String[] args) {

        int[] a = {1, 11, 111, 11, -11};

        System.out.println(isVanilla(a));
    }

    public static int isVanilla(int[] a) {
        if (a.length == 0) {
            return 1;
        }

        int digit = a[0] % 10;

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            while (num > 0) {
                if (digit != num % 10) {
                    return 0;
                }
                num /= 10;
            }
        }
        return 1;
    }
}
