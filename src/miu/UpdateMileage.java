package miu;

public class UpdateMileage {
    public static void main(String[] args) {

        int[] a = {8,9,9,5,0};

        updateMileage(a, 13);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void updateMileage(int[] a, int miles) {
        for (int i = 0; i < miles; i++) {
            incrementMileage(a);
        }
    }

    public static void incrementMileage(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 9) {
                a[i]++;
                return;
            }
            a[i] = 0;
        }
    }
}
