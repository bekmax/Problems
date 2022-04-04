package miu;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        char[] a1 = {'s', 'w', 'i', 't'};
        char[] a2 = {'i', 't', 's', 'w'};

        System.out.println(areAnagrams(a1, a2));
    }

    public static int areAnagrams(char[] a1, char[] a2) {
        if (a1.length != a2.length) return 0;
        char[] arr1 = Arrays.copyOf(a1, a1.length);
        char[] arr2 = Arrays.copyOf(a2, a2.length);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return 0;
            }
        }
        return 1;
    }
}
