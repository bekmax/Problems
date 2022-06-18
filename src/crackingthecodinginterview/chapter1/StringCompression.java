package crackingthecodinginterview.chapter1;

public class StringCompression {
    public static void main(String[] args) {

        String s = "abbcccddddee";

        System.out.println(compressString(s));
    }

    public static String compressString(String s) {
        if (s == null || s.length() == 0) return s;
        StringBuilder res = new StringBuilder();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;

            if((i+1)>=s.length() || s.charAt(i) != s.charAt(i+1)){
                res.append(s.charAt(i)).append(count);
                count = 0;
            }
        }

        return res.toString().length() < s.length() ? res.toString() : s;
    }
}
