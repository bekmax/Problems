package miu;

public class ArrayHasNoZeros {
    public static void main(String[] args) {

        int[] a = {};

        System.out.println(arrayHasNoZeros(a));
    }

    public static int arrayHasNoZeros(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) return 0;
        }
        return 1;
    }
}
