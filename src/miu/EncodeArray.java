package miu;

public class EncodeArray {
    public static void main(String[] args) {

        int[] a = encodeArray(999);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int[] encodeArray(int n) {
        int sign = n >= 0 ? 1 : -1;
        int len = 0;
        int num = sign * n;
        while (num > 0) {
            num /= 10;
            len++;
        }
        int[] digits = new int[len];
        int encodedArrayLength = 0;
        num = sign * n;
        while (num > 0) {
            digits[--len] = num % 10;
            encodedArrayLength += digits[len] + 1;
            num /= 10;
        }

        if (sign == -1) encodedArrayLength++;
        int[] encodedArray = new int[encodedArrayLength];
        int index = 0;
        if (sign == -1) {
            encodedArray[0] = -1;
            index = 1;
        }
        if (n == 0) return new int[]{1};
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j <= digits[i]; j++) {
                if (j != digits[i]) {
                    encodedArray[index++] = 0;
                } else {
                    encodedArray[index++] = 1;
                }
            }
        }
        return encodedArray;
    }
}
