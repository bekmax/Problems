package miu;

public class ClosestFibonacci {
    public static void main(String[] args) {

        System.out.println(closestFibonacci(150));
    }

    public static int closestFibonacci(int n) {
        int fb1 = 1;
        int fb2 = 1;

        while (fb2 <= n) {
            int temp = fb1;
            fb1 = fb2;
            fb2 = fb2 + temp;
        }

        return fb1;
    }
}
