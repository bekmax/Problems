package leetcode.easy;

// Leetcode Problem N804
// Related Topic: Array, Hash Table, String
//        International Morse Code defines a standard encoding where each
//        letter is mapped to a series of dots and dashes, as follows:
//                'a' maps to ".-",
//                'b' maps to "-...",
//                'c' maps to "-.-.", and so on.
//        For convenience, the full table for the 26 letters of the English alphabet is given below:
//
//        [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
//        "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
//
//        Given an array of strings words where each word can be written
//        as a concatenation of the Morse code of each letter.
//
//        For example, "cab" can be written as "-.-..--...",
//        which is the concatenation of "-.-.", ".-", and "-...".
//        We will call such a concatenation the transformation of a word.
//        Return the number of different transformations among all words we have.

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {

    }

    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] MorseCode = new String[]{
                    ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                    "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                    "...-",".--","-..-","-.--","--.."
            };

            //HashSet accepts unique elements only
            Set<String> result = new HashSet();

            for(String word: words){
                StringBuilder code = new StringBuilder();

                for(char c: word.toCharArray()){
                    code.append(MorseCode[c-'a']);
                }

                result.add(code.toString());
            }

            return result.size();
        }
    }
}
