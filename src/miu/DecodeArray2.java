package miu;

public class DecodeArray2 {
    public static void main(String[] args) {

        int[] a = {0, 1, 1, 1, 1, 1, 0, 1};

        System.out.println(decodeArray(a));
    }

    public static int decodeArray(int[] a) {
        int num = 0;
        int result = 0;

        if (a[0] != -1) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != 1) {
                    num++;
                } else {
                    result = result * 10 + num;
                    num = 0;
                }
            }
        } else {
            for (int i = 1; i < a.length; i++) {
                if (a[i] != 1) {
                    num++;
                } else {
                    result = result * 10 + num;
                    num = 0;
                }
            }
            result *= -1;
        }

        return result;
    }
}
