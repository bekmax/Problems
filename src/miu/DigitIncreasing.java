package miu;

public class DigitIncreasing {
    public static void main(String[] args) {

        System.out.println(digitIncreasing(7404));
    }

    public static int digitIncreasing(int n) {

        for (int i = 1; i <= 9; i++) {
            int num = 0;
            int sum = 0;

            while (sum < n) {
                num = num * 10 + i;
                sum += num;
                if (sum == n) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
