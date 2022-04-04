package miu;

public class OddHeavyArray {
    public static void main(String[] args) {

        int[] a = {-2, -4, -6,-1, -8};

        System.out.println(isOddHeavy(a));
    }

    public static int isOddHeavy(int[] a) {
        if (containsOddValue(a)) {
            int minOddValue = getMinOddValue(a);

            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0 && a[i] > minOddValue) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static boolean containsOddValue(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) return true;
        }
        return false;
    }

    public static int getMinOddValue(int[] a) {
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] < minOdd) {
                minOdd = a[i];
            }
        }
        return minOdd;
    }
}
