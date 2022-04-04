package miu;

import java.util.Arrays;

public class InertialArray {
    public static void main(String[] args) {

        int[] a = {11, 4, 20, 9, 2, 8};
        int[] b = {2, 12, 12, 4, 6, 8, 11};

        System.out.println(isInertial(a));
        System.out.println(isInertial(b));

    }

    public static int isInertial(int[] a) {
        if (checkIfOddNumberExists(a)) {
            System.out.println("a condition is met");
            if (getMaxNumber(a) % 2 == 0) {
                System.out.println("b condition is met");
                if (checkIfOddNumbersAreGreater(a)) {
                    System.out.println("c condition is met");
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean checkIfOddNumberExists(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) return true;
        }
        return false;
    }

    public static int getMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkIfOddNumbersAreGreater(int[] arr) {
        int oddMin = Integer.MAX_VALUE;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (oddMin > arr[i]) {
                    oddMin = arr[i];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != getMaxNumber(arr)) {
                if (oddMin < arr[i]) {
                    counter++;
                }
            }
        }
        return counter == 0;
    }

}
