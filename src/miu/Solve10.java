package miu;

public class Solve10 {
    public static void main(String[] args) {

        int[] a = solve10();
        System.out.println(a[0] + " " + a[1]);
    }

    public static int[] solve10() {
        int tenFactorial = getFactorial(10);


        for (int i = 1; i < 10; i++) {
            int xFactorial = getFactorial(i);

            for (int j = i + 1; j < 10; j++) {
                int yFactorial = getFactorial(j);
                if (xFactorial + yFactorial == tenFactorial) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalStateException("No solution exists");
    }

    public static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
