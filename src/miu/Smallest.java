package miu;

public class Smallest {
    public static void main(String[] args) {

        System.out.println(smallest(7));
    }

    public static int smallest(int n) {
        int count = 0;
        int number = 2;

        while (count < n) {
            for (int i = 1; i <= n; i++) {
                int multiple = number * i;
                if (containsDigitTwo(multiple)) {
                    count++;
                } else {
                    count = 0;
                    break;
                }
            }
            number++;
        }
        return number - 1;
    }

    public static boolean containsDigitTwo(int n) {
        while (n != 0) {
            if (n % 10 == 2) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
