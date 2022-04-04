package miu;

public class PackedArray {
    public static void main(String[] args) {

        int[] a = {1, 2, -2};

        System.out.println(isPacked(a));
    }

    public static int isPacked(int[] a) {
        if (a.length == 0) return 1;

        if (a.length == 1) {
            if (a[0] == 0) return 1;
            else {
                return 0;
            }
        }

        int counter = 0;

        while (counter < a.length) {
            int countNum = 1;
            int i = counter + 1;

            while (i < a.length && a[counter] == a[i]) {
                countNum++;
                i++;
            }

            if (countNum != a[counter]) {
                return 0;
            }
            counter = i;
        }
        return 1;
    }
}
