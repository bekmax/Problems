package miu;

public class Eval {
    public static void main(String[] args) {

        int[] a = {4,0,9};
        double x = 2.0;

        System.out.println(eval(x, a));
    }

    public static double eval(double x, int[] a) {
        double sum = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            sum += Math.pow(x, i) * a[i];
        }
        return sum;
    }
}
