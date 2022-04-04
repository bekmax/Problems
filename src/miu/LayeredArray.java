package miu;

public class LayeredArray {
    public static void main(String[] args) {

        int[] a = {2, 2, 2, 3, 3, 1, 1};

        System.out.println(isLayered(a));
    }

    public static int isLayered(int[] a) {
        int appearCount = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) return 0;
            if (a[i] == a[i - 1]) appearCount++;
            if (a[i] > a[i - 1]) {
                if (appearCount < 2) return 0;
                appearCount = 0;
            }
        }
        return appearCount >= 2 ? 1 : 0;
    }
}
