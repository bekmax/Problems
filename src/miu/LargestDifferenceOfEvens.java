package miu;

public class LargestDifferenceOfEvens {
    public static void main(String[] args) {

        int[] a = {-5,3,7,9,55};

        System.out.println(largestDifferenceOfEvens(a));
    }

    public static int largestDifferenceOfEvens(int[] a){
        int minEven = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        int numOfEvens = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                numOfEvens++;
                if (minEven > a[i]) minEven = a[i];
                if (maxEven < a[i]) maxEven = a[i];
            }
        }

        if (numOfEvens > 1){
            return maxEven - minEven;
        }
        return -1;
    }
}
