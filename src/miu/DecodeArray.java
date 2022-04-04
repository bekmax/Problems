package miu;

public class DecodeArray {
    public static void main(String[] args) {

        int[] a = {0, -3, 0, -4, 0};
        int[] b = {-1, 5, 8, 17, 15};
        int[] c = {111, 115, 118, 127, 125};

        System.out.println(decodeArray(a));
        System.out.println(decodeArray(b));
        System.out.println(decodeArray(c));
    }

    public static int decodeArray(int[] a){
        int sign = a[0] >= 0 ? 1 : -1;
        int num = 0;

        for (int i = 0; i < a.length-1; i++) {
            num = num * 10 + Math.abs(a[i] - a[i+1]);
        }
        return num * sign;
    }
}
