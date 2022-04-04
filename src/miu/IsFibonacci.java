package miu;

public class IsFibonacci {
    public static void main(String[] args) {

        System.out.println(isFibonacci(2));
    }

    public static int isFibonacci(int n) {
        int num1 = 1;
        int num2 = 1;

        while (n >= num2) {
            if (n == num2) return 1;
            int temp = num1;
            num1 = num2;
            num2 = num2 + temp;
        }
        return 0;
    }
}
