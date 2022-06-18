package crackingthecodinginterview.chapter1;

// Given an image represented by an NxN matrix, where each pixel in the image is 4 byte, write
// a method to rotate the image in 90 degrees. Can you do that in place?
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };

        print(nums);
        rotateMatrix(nums);
        System.out.println();
        print(nums);

    }

    public static boolean rotateMatrix(int[][] image) {
        if (image.length == 0 || image.length != image[0].length) return false;
        int n = image.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = image[first][i];
                // left -> top
                image[first][i] = image[last-offset][first];
                // bottom -> left
                image[last-offset][first] = image[last][last-offset];
                // right -> bottom
                image[last][last-offset] = image[i][last];
                // top -> right
                image[i][last] = top;
            }
        }
        return true;
    }

    public static void print(int[][] nums){
        for (int[] arr : nums){
            for (int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
