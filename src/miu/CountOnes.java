package miu;

public class CountOnes {
    public static void main(String[] args) {

        System.out.println(countOnes(15));
    }

    public static int countOnes(int n) {
        int count1s = 0;

        while (n > 0) {
            if (n % 2 == 1) count1s++;
            n /= 2;
        }
        return count1s;
    }
}
