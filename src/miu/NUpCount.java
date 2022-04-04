package miu;

public class NUpCount {
    public static void main(String[] args) {

        //int[] a = {2,3,1,-6,8,-3,-1,2};
        int[] a = {6, 3, 1};
        System.out.println(nUpCount(a, 5));
    }

    public static int nUpCount(int[] a, int n) {
        int sum = 0;
        int nUpCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (sum <= n && (sum + a[i]) > n) {
                nUpCount++;
            }
            sum += a[i];
        }
        return nUpCount;
    }
}
