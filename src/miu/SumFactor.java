package miu;

public class SumFactor {
    public static void main(String[] args) {

        int[] a = {3, 0, 2, -5, 0};
        System.out.println(sumFactor(a));
    }

    public static int sumFactor(int[] a){
        int sum = 0;
        int sumFactor = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) sumFactor++;
        }

        return sumFactor;
    }
}
