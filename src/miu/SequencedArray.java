package miu;

public class SequencedArray {
    public static void main(String[] args) {

        int[] a = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
        int m = -5;
        int n = -2;

        System.out.println(isSequencedArray(a, m, n));
    }

    public static int isSequencedArray(int[] a, int m, int n){
        int sequence = m;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sequence && a[i] <= n) continue;
            if (a[i] == sequence + 1 && a[i] <= n){
                sequence++;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
