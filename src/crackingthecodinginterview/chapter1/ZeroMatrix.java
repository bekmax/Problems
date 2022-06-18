package crackingthecodinginterview.chapter1;

// Write an algorithm such that if an element in MxN matrix is 0 its entire row and column are set to zero
public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 0, 4},
                {1, 2, 3, 4},
                {1, 0, 3, 4},
                {1, 2, 3, 4}
        };

        print(nums);
        zeroMatrix(nums);
        System.out.println();
        print(nums);
    }

    public static boolean zeroMatrix(int[][] nums) {
        if (nums.length == 0) return false;

        int[] rows = new int[nums.length];
        int[] cols = new int[nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 0) {
                    rows[i] = -1;
                    cols[j] = -1;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == -1) makeRowZero(nums, i);
        }
        for (int i = 0; i < cols.length; i++) {
            if (cols[i] == -1) makeColsZero(nums, i);
        }
        return true;
    }

    public static void makeRowZero(int[][] nums, int row) {
        for (int j = 0; j < nums[row].length; j++) {
            nums[row][j] = 0;
        }
    }

    public static void makeColsZero(int[][] nums, int col) {
        for (int i = 0; i < nums.length; i++) {
            nums[i][col] = 0;
        }
    }

    public static void print(int[][] nums) {
        for (int[] arr : nums) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
