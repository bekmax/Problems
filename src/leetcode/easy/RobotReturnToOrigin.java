package leetcode.easy;

// Leetcode problem N657
// Related Topic: String, Simulation
//        There is a robot starting at the position (0, 0), the origin, on a 2D plane.
//        Given a sequence of its moves, judge if this robot
//        ends up at (0, 0) after it completes its moves.
//        You are given a string moves that represents the move sequence
//        of the robot where moves[i] represents its ith move.
//        Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
//        Return true if the robot returns to the origin after it finishes
//        all of its moves, or false otherwise.
//        Note: The way that the robot is "facing" is irrelevant.
//        'R' will always make the robot move to the right once,
//        'L' will always make it move left, etc. Also, assume that the
//        magnitude of the robot's movement is the same for each move.

public class RobotReturnToOrigin {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean judgeCircle(String moves) {
            int x = 0;
            int y = 0;

            char[] charArr = moves.toCharArray();

            for (char c : charArr) {
                switch (c) {
                    case 'R':
                        x += 1;
                        break;
                    case 'L':
                        x -= 1;
                        break;
                    case 'U':
                        y += 1;
                        break;
                    case 'D':
                        y -= 1;
                        break;
                    default:
                }
            }

            if (x == 0 && y == 0) {
                return true;
            }

            return false;
        }
    }
}
