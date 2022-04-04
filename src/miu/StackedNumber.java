package miu;

public class StackedNumber {
    public static void main(String[] args) {

        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(5));
        System.out.println(isStacked(6));
    }

    public static int isStacked(int n) {
        int deduction = 1;
        while (n > 0) {
            n = n - deduction++;
        }

        return n == 0 ? 1 : 0;
    }
}
