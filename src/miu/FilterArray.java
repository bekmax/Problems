package miu;

public class FilterArray {
    public static void main(String[] args) {

        int[] arr = {8, 4, 9, 0, 3, 1, 2};
        int n = 11;

        int[] result = filterArray(arr, n);

        for (int i: result){
            System.out.print(i+" ");
        }
    }

    public static int[] filterArray(int[] a, int n){
        int arrSize = calculateArraySize(n);
        int[] result = new int[arrSize];

        result = fillArrayWithIndexes(result, n);

        for (int i = 0; i < result.length; i++) {
            result[i] = a[result[i]];
        }
        return result;
    }

    public static int[] fillArrayWithIndexes(int[] arr, int n){
        int index = 0;
        int value = 0;
        while (n > 0){
            int digit = n % 2;
            if (digit != 0){
                arr[index++] = value;
            }
            n /= 2;
            value++;
        }
        return arr;
    }

    public static int calculateArraySize(int n){
        int size = 0;

        while (n > 0){
            int digit = n % 2;
            if (digit != 0) size++;
            n /= 2;
        }
        return size;
    }

}
