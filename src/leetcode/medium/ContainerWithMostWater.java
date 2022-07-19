package leetcode.medium;

// Leetcode Problem N11
// Related Topic: Array, Two Pointers, Greedy
//        You are given an integer array height of length n.
//        There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//        Return the maximum amount of water a container can store. Notice that you may not slant the container.
public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] arr2 = {2, 3, 4, 5, 18, 17, 6};

        //System.out.println(solution2.maxArea(arr));
        System.out.println(solution2.maxArea(arr2));
    }

    // Brute Force Solution using nested for - pretty slow, but straightforward
    static class Solution1 {
        public int maxArea(int[] height) {
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < height.length - 1; i++) {
                for (int j = 1; j < height.length; j++) {
                    int area = Math.min(height[i], height[j]) * (j - i);
                    if (area > max) {
                        max = area;
                    }
                }
            }
            return max;
        }
    }

    // Two Pointer solution - pretty fast
    static class Solution2 {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int max = Integer.MIN_VALUE;

            while (left <= right) {
                int area = Math.min(height[left], height[right]) * (right - left);
                if (max < area) {
                    max = area;
                }
                if (height[left] == Math.min(height[left], height[right])) {
                    int shorterColumn = height[left];
                    while (left < height.length && height[left] <= shorterColumn) {
                        left++;
                    }
                } else {
                    int shorterColumn = height[right];
                    while (right >= 0 && height[right] <= shorterColumn) {
                        right--;
                    }
                }
            }
            return max;
        }
    }
}
