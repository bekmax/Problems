package leetcode.easy;

// Leetcode Problem N1812
// Related Topic: Math, String
//        You are given coordinates, a string that represents the coordinates of a square of the chessboard.
//        Below is a chessboard for your reference.
//        Return true if the square is white, and false if the square is black.
//        The coordinate will always represent a valid chessboard square.
//        The coordinate will always have the letter first, and the number second.

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean squareIsWhite(String coordinates) {

            if(((int)(coordinates.charAt(0) + coordinates.charAt(1)))%2==0){
                return false;
            }
            return true;
        }
    }
}
