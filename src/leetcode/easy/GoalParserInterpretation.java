package leetcode.easy;

// Leetcode Problem N1678
// Related Topic: String
//        You own a Goal Parser that can interpret a string command.
//        The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
//        The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)"
//        as the string "al". The interpreted strings are then concatenated in the original order.
//        Given the string command, return the Goal Parser's interpretation of command.

public class GoalParserInterpretation {
    public static void main(String[] args) {

    }

    static class Solution {
        public String interpret(String command) {

            String result = "";

            result = command.replace("()", "o");
            result = result.replace("(al)", "al");

            return result;
        }
    }
}
