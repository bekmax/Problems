package miu;

public class MatchPattern {
    public static void main(String[] args) {

        int[] a = {1, 1, 1, 1, 2, 3};
        int[] pattern = {1, 2};

        System.out.println(matchPattern(a, pattern));
    }

    public static int matchPattern(int[] a, int[] pattern) {
        int i = 0;
        int k = 0;
        int matches = 0;

        for (i = 0; i < a.length; i++) {
            if (a[i] == pattern[k]) {
                matches++;
            } else if (matches == 0 || k == pattern.length - 1) {
                return 0;
            } else {
                k++;
                if (a[i] == pattern[k]) {
                    matches++;
                } else {
                    return 0;
                }
            }
        }

        if (i == a.length && k == pattern.length - 1) return 1;
        else return 0;

    }
}
