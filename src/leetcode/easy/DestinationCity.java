package leetcode.easy;

// Leetcode Problem N1436
// Related Topic:
//        You are given the array paths, where paths[i] = [cityAi, cityBi] means
//        there exists a direct path going from cityAi to cityBi.
//        Return the destination city, that is, the city without any path outgoing to another city.
//        It is guaranteed that the graph of paths forms a line without any loop,
//        therefore, there will be exactly one destination city.

import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public static void main(String[] args) {

    }

    static class Solution {
        public String destCity(List<List<String>> paths) {

            String finalDestination = null;
            HashSet<String> sources = new HashSet<String>();

            for (List<String> path : paths) {
                sources.add(path.get(0));
            }

            for (List<String> path : paths) {
                String destination = path.get(1);

                if (!sources.contains(destination)) {
                    finalDestination = destination;
                    break;
                }
            }

            return finalDestination;
        }
    }
}
