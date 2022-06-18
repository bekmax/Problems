package crackingthecodinginterview.chapter1;

// Given a string write a function if it is a permutation of a palindrome

public class PalindromePermutation {
    public static void main(String[] args) {
        String s = "Tact coa";

        System.out.println(palindromePermutation(s));
    }

    // Time Complexity O(N)
    // Space Complexity O(1)
    public static boolean palindromePermutation(String s) {
        int[] arr = new int[128];
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                int val = s.charAt(i);
                if (arr[val] == 0) {
                    arr[val]++;
                } else {
                    arr[val]--;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1 || arr[i] < 0) return false;
            sum += arr[i];
        }

        return sum == 0 || sum == 1;
    }
}
