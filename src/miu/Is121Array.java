package miu;

public class Is121Array {
    public static void main(String[] args) {

        int[] a = {1, 1, 3, 1, 1};

        System.out.println(is121Array(a));
    }

    public static int is121Array(int[] a) {
        int head = 0;
        int tail = a.length - 1;
        boolean isOne = true;

        while (head <= tail) {
            if (isOne) {
                if (a[head] != 1 || a[tail] != 1) {
                    return 0;
                }
                head++;
                tail--;
                if (a[head] != 1 && a[tail] != 1) {
                    isOne = false;
                }
            } else {
                if (a[head] != 2 || a[tail] != 2) {
                    return 0;
                }
                head++;
                tail--;
            }
        }
        return isOne ? 0 : 1;
    }
}
