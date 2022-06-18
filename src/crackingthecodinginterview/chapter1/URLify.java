package crackingthecodinginterview.chapter1;

// Write a method to replace all spaces in a string with %20.

public class URLify {
    public static void main(String[] args) {
        String s = "Mr John Smith    ";

        System.out.println(getUrl(s, 13));
    }

    // Time Complexity O(N)
    // Space Complexity O(1)
    public static String getUrl(String s, int trueLength) {
        char[] charArr = s.toCharArray();
        trueLength--;
        for (int i = charArr.length - 1; i >= 0; i--) {
            if (charArr[trueLength] != ' ') {
                charArr[i] = charArr[trueLength--];
            } else {
                charArr[i--] = '0';
                charArr[i--] = '2';
                charArr[i] = '%';
                trueLength--;
            }
        }
        return new String(charArr);
    }
}
