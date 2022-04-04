package miu;

public class MadhavArray {
    public static void main(String[] args) {

        //int[] a = {2, 1, 1, 4, -1, -1};
        int[] a = {3, 1, 2, 3, 0};

        System.out.println(isMadhavArray(a));
    }

    public static int isMadhavArray(int[] a) {

        if (!checkLength(a.length)) return 0;

        int baseSum = a[0];
        int counter = 0;

        for (int i = 0; i < a.length; i += counter) {
            int start = i;
            int end = start + counter;
            int sum = 0;

            while (start <= end){
                sum += a[start];
                start++;
            }
            if(baseSum != sum){
                return 0;
            }
            counter++;
        }

        return 1;
    }

    public static boolean checkLength(int n) {
        int num = 1;

        while (num <= n) {
            n -= num++;
        }

        if (n == 0) return true;
        return false;
    }
}
