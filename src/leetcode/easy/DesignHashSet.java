package leetcode.easy;

// Leetcode Problem N705
// Related Topic: Array, HashTable, LinkedList, Design, Hash Function
//        Design a HashSet without using any built-in hash table libraries.
//        Implement MyHashSet class:
//            void add(key) Inserts the value key into the HashSet.
//            bool contains(key) Returns whether the value key exists in the HashSet or not.
//            void remove(key) Removes the value key in the HashSet.
//            If key does not exist in the HashSet, do nothing.

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        for(int i = 0; i < 100; i++){
            int number = (int) (Math.random() * 10000);
            myHashSet.add(number);
        }

        System.out.println(myHashSet.toString());
    }

    static class MyHashSet {

        private final int Buckets = 10;
        private List<Integer>[] buckets;

        public MyHashSet() {
            buckets = new ArrayList[Buckets];
            for (int i = 0; i < Buckets; i++) {
                buckets[i] = new ArrayList<Integer>();
            }
        }

        public void add(int key) {
            if (contains(key)) {
                return;
            }

            int hashIndex = hashCode(key);
            buckets[hashIndex].add(key);
        }

        public void remove(int key) {
            int hashIndex = hashCode(key);
            List<Integer> currentBucket = buckets[hashIndex];

            if (currentBucket.size() == 0) {
                return;
            }

            currentBucket.removeIf(elem -> elem == key);
        }

        public boolean contains(int key) {
            int hashIndex = hashCode(key);
            List<Integer> currentBucket = buckets[hashIndex];

            if (currentBucket.size() == 0) {
                return false;
            }
            for (Integer element : currentBucket) {
                if (element == key) return true;
            }
            return false;
        }

        public int hashCode(int key) {
            return key % Buckets;
        }

        public String toString(){
            String s = "";

            for (List<Integer> list: buckets){
                s += list.toString() + "\n";
            }
            return s;
        }
    }
}
