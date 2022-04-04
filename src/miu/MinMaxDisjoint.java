package miu;

public class MinMaxDisjoint {
    public static void main(String[] args) {

        int[] a = {5, 4, 4, 3, 1};

        System.out.println(isMinMaxDisjoint(a));
    }

    public static int isMinMaxDisjoint(int[] a) {
        if (a.length == 0 || a.length == 1 || a.length == 2) {
            return 0;
        }

        int max = findMax(a);
        int min = findMin(a);

        if (numberCount(a, max) > 1) return 0;
        if (numberCount(a, min) > 1) return 0;

        if (isAdjacent(a, max, min)) return 0;

        return 1;
    }

    public static boolean isAdjacent(int[] a, int max, int min) {
        for (int i = 1; i < a.length; i++) {
            if ((a[i - 1] == min && a[i] == max) || (a[i - 1] == max && a[i] == min)) {
                return true;
            }
        }
        return false;
    }

    public static int numberCount(int[] a, int num) {
        int count = 0;
        for (int n : a) {
            if (num == n) count++;
        }
        return count;
    }

    public static int findMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int n : a) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }

    public static int findMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int n : a) {
            if (min > n) {
                min = n;
            }
        }
        return min;
    }

}
