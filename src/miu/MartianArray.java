package miu;

public class MartianArray {
    public static void main(String[] args) {

        int[] a = {2};

        System.out.println(isMartian(a));
    }

    public static int isMartian(int[] a) {
        int balance = 0;

        if (a.length == 0) return 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                if (a[i] == 1) balance++;
                if (a[i] == 2) balance--;
            } else {
                return 0;
            }
        }

        if (a[a.length - 1] == 1) balance++;
        if (a[a.length - 1] == 2) balance--;

        return balance > 0 ? 1 : 0;
    }
}
