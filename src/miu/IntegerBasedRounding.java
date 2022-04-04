package miu;

public class IntegerBasedRounding {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        doIntegerBasedRounding(a, 5);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void doIntegerBasedRounding(int[] a, int n) {
        if (n > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] <= 0) continue;
                a[i] = round(a[i], n);
            }
        }
    }

    public static int round(int num, int base) {

        int ceiling = ((num / base) + 1) * base;
        int floor = (num / base) * base;

        int floorDiff = num - floor;
        int ceilingDiff = ceiling - num;

        if (floorDiff < ceilingDiff) {
            return floor;
        }
        return ceiling;
    }
}
