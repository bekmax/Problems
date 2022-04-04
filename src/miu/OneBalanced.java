package miu;

public class OneBalanced {
    public static void main(String[] args) {

        int[] a = {1, 1, 4, 5, 6, 1, 1};

        System.out.println(isOneBalanced(a));
    }

    public static int isOneBalanced(int[] a) {
        int numOf1s = 0;
        int numOfNon1s = 0;
        boolean non1Start = false;
        boolean non1End = false;

        if (a.length == 0) return 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                if (non1Start) non1End = true;
                numOf1s++;
            } else {
                if (non1End) return 0;
                non1Start = true;
                numOfNon1s++;
            }
        }

        if (numOf1s != numOfNon1s) return 0;
        return 1;
    }
}
