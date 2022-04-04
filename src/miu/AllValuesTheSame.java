package miu;

public class AllValuesTheSame {
    public static void main(String[] args) {

        int[] a = {6};

        System.out.println(allValuesTheSame(a));
    }

    public static int allValuesTheSame(int[] a) {
        if (a.length == 0) return 0;
        int referenceNum = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != referenceNum) return 0;
        }
        return 1;
    }
}
