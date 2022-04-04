package miu;

public class SystematicallyIncreasingArray {
    public static void main(String[] args) {

        int[] a = {1,1,2,1,2,3};

        System.out.println(isSystematicallyIncreasing(a));
    }

    public static int isSystematicallyIncreasing(int[] a) {
        int seqLength = 1;
        int index = 0;

        while (index < a.length) {
            for (int i = 0; i < seqLength; i++) {
                if (index >= a.length || a[index++] != i + 1) {
                    return 0;
                }
            }
            seqLength++;
        }
        return 1;
    }
}
