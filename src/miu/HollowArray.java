package miu;

public class HollowArray {
    public static void main(String[] args) {

        int[] a = {2, 3, 0, 0, 0, 5, 7};

        System.out.println(isHollow(a));
    }

    public static int isHollow(int[] a) {
        int head = 0;
        int middle = 0;
        int tail = 0;
        int cursor = 0;

        for (int i = cursor; i < a.length; i++) {
            if (a[i] == 0) {
                cursor = i;
                break;
            }
            if (a[i] != 0) head++;
        }
        for (int i = cursor; i < a.length; i++) {
            if (a[i] != 0) {
                cursor = i;
                break;
            }
            if (a[i] == 0) middle++;
        }
        for (int i = cursor; i < a.length; i++) {
            if (a[i] == 0) {
                cursor = i;
                break;
            }
            if (a[i] != 0) tail++;
        }

        if (middle == 3 && head == tail) {
            return 1;
        }
        return 0;
    }
}
