package leetcode.easy;

// Leetcode problem N1108
// Related Topic: String
//        Given a valid (IPv4) IP address, return a defanged version of that IP address.
//        A defanged IP address replaces every period "." with "[.]".

public class DefangingAnIPAddress {
    public static void main(String[] args) {

    }

    static class Solution {
        public String defangIPaddr(String address) {
            String result = "";

            for(int i=0; i<address.length(); i++){
                if(address.charAt(i) == '.'){
                    result += "[.]";
                }
                else{
                    result += address.charAt(i);
                }
            }
            return result;
        }
    }
}
