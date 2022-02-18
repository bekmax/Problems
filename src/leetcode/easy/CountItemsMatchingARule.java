package leetcode.easy;

// Leetcode Problem N1773
// Related Topic: Array, String
//        You are given an array items, where each items[i] = [typei, colori, namei] describes
//        the type, color, and name of the ith item.
//        You are also given a rule represented by two strings, ruleKey and ruleValue.
//        The ith item is said to match the rule if one of the following is true:
//            ruleKey == "type" and ruleValue == typei.
//            ruleKey == "color" and ruleValue == colori.
//            ruleKey == "name" and ruleValue == namei.
//        Return the number of items that match the given rule.

import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {

    }

    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

            int count = 0;

            for(List item: items){
                switch(ruleKey){
                    case "type":
                        if(item.get(0).equals(ruleValue)) count++;
                        break;
                    case "color":
                        if(item.get(1).equals(ruleValue)) count++;
                        break;
                    case "name":
                        if(item.get(2).equals(ruleValue)) count++;
                        break;
                    default:
                }
            }
            return count;
        }
    }
}
