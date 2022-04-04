package miu;

public class OnionArray {
    public static void main(String[] args) {

        int[] a = {1,6,19,4,5};

        System.out.println(isOnionArray(a));
    }

    public static int isOnionArray(int[] a) {
        int j = 0;
        int k = a.length - 1;

        while (j != k) {
            if (j + k == a.length - 1) {
                if (a[j] + a[k] > 10) {
                    return 0;
                }
                j++;
                k--;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
