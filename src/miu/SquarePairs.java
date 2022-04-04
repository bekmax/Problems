package miu;

import java.util.Arrays;

public class SquarePairs {
    public static void main(String[] args) {

        int[] a = {9, 12, 4,6,8,3,13};
        System.out.println(countSquarePairs(a));
    }

    public static int countSquarePairs(int[] a) {
        int counter = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= 0) continue;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] <= 0) continue;
                if(isPerfectSquare(a[i]+a[j]) == 1){
                    System.out.println(a[i] +" "+a[j]);
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int isPerfectSquare(int number) {
        int n = (int) Math.sqrt(number);

        if (n * n == number) return 1;
        return 0;
    }
}
