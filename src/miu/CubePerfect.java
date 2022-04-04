package miu;

public class CubePerfect {
    public static void main(String[] args) {

        int[] a = {-1, 0, 1};

        System.out.println(isCubePerfect(a));
    }

    public static int isCubePerfect(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) a[i] = -a[i];
            if (!isCube(a[i])) return 0;
        }
        return 1;
    }

    public static boolean isCube(int n) {
        for (int i = 0; i * i * i <= n; i++) {
            if (i * i * i == n) return true;
        }
        return false;
    }
}
