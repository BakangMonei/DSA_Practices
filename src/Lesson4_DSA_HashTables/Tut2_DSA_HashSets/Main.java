package Lesson4_DSA_HashTables.Tut2_DSA_HashSets;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0300 hours
 */

import java.util.*;


/* Hash Sets
    - A Hash Set is a form of Hash Table data structure that usually holds a large number of elements.
    - Using a Hash Set we can search, add, and remove elements really fast.
    - Hash Sets are used for lookup, to check if an element is part of a set.
*/


public class Main {
    public static void main(String[] args) {
        SimpleHashSet hashSet = new SimpleHashSet(10);

        hashSet.add("Charlotte");
        hashSet.add("Thomas");
        hashSet.add("Jens");
        hashSet.add("Peter");
        hashSet.add("Lisa");
        hashSet.add("Adele");
        hashSet.add("Michaela");
        hashSet.add("Bob");

        hashSet.printSet();

        System.out.println("\n'Peter' is in the set: " + hashSet.contains("Peter"));
        System.out.println("Removing 'Peter'");
        hashSet.remove("Peter");
        System.out.println("'Peter' is in the set: " + hashSet.contains("Peter"));
        System.out.println("'Adele' has hash code: " + hashSet.hashFunction("Adele"));
    }

    static class SimpleHashSet {
        private final int size;
        private final List<List<String>> buckets;

        public SimpleHashSet(int size) {
            this.size = size;
            this.buckets = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                buckets.add(new ArrayList<>()); // Use ArrayList for the buckets
            }
        }

        private int hashFunction(String value) {
            return value.chars().reduce(0, Integer::sum) % size;
        }

        public void add(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            if (!bucket.contains(value)) {
                bucket.add(value);
            }
        }

        public boolean contains(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            return bucket.contains(value);
        }

        public void remove(String value) {
            int index = hashFunction(value);
            List<String> bucket = buckets.get(index);
            bucket.remove(value);
        }

        public void printSet() {
            System.out.println("Hash Set Contents:");
            for (int index = 0; index < buckets.size(); index++) {
                List<String> bucket = buckets.get(index);
                System.out.println("Bucket " + index + ": " + bucket);
            }
        }
    }
}
