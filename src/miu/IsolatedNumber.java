package miu;

import java.util.ArrayList;
import java.util.List;

public class IsolatedNumber {
    public static void main(String[] args) {

        System.out.println(isIsolated(162));
    }

    public static int isIsolated(long n) {
        if(n > 2097151) return -1;

        long square = (long) Math.pow(n, 2);
        long cube = (long) Math.pow(n, 3);

        List<Integer> squareArr = new ArrayList<Integer>();
        List<Integer> cubeArr = new ArrayList<Integer>();

        while (square > 0) {
            int sDigit = (int) square % 10;
            square /= 10;
            squareArr.add(sDigit);
        }

        while (cube > 0) {
            int cDigit = (int) cube % 10;
            cube /= 10;
            cubeArr.add(cDigit);
        }

        for (Integer i : squareArr) {
            if (cubeArr.contains(i)) {
                return 0;
            }
        }
        return 1;
    }
}
