package miu;

public class NUnique {
    public static void main(String[] args) {

        int[] a = {7, 3, 3, 2, 4};
        int n = 9;

        System.out.println(nUnique(a, n));
    }

    public static int nUnique(int[] a, int n) {
        int count = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
            }
        }
        return count == 1 ? 1 : 0;
    }
}
