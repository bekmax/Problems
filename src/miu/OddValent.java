package miu;

public class OddValent {
    public static void main(String[] args) {

        int[] a = {6, 3, 4, 6, 1};

        System.out.println(isOddValent(a));
    }

    public static int isOddValent(int[] a) {
        boolean oddNumberExists = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) oddNumberExists = true;
        }

        if (oddNumberExists) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) return 1;
                }
            }
        }
        return 0;
    }
}
