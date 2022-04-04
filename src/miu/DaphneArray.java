package miu;

public class DaphneArray {
    public static void main(String[] args) {

        int[] a = {1,7,33,79};

        System.out.println(isDaphne(a));
    }

    public static int isDaphne(int[] a) {
        int countEvenNumbers = 0;
        int countOddNumbers = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) countEvenNumbers++;
            else if (a[i] % 2 != 0) countOddNumbers++;
        }

        if (countEvenNumbers == 0 && countOddNumbers > 0) return 1;
        else if (countEvenNumbers > 0 && countOddNumbers == 0) return 1;
        else {
            return 0;
        }
    }
}
