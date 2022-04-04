package miu;

public class AllPossibilitiesArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 0, 3};

        System.out.println(isAllPossibilities(a));
    }

    public static int isAllPossibilities(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < 0 || a[i] > a.length - 1) return 0;
                if (a[j] < 0 || a[j] > a.length - 1) return 0;
                if (a[i] == a[j]) return 0;
            }
        }
        return 1;
    }
}
