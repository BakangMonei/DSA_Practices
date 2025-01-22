package Lesson4_DSA_HashTables.Tut3_DSA_HashMaps;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0303 hours
 */

import java.util.*;
/* Hash Maps
    - A Hash Map is a form of Hash Table data structure that usually holds a large number of entries.
    - Using a Hash Map we can search, add, modify, and remove entries really fast.
    - Hash Maps are used to find detailed information about something.
*/


/* It is easier to understand how Hash Maps work if you first have a look at the two previous pages about Hash Tables and Hash Sets. It is also important to understand the meaning of the words below.
    - Entry: Consists of a key and a value, forming a key-value pair.
    - Key: Unique for each entry in the Hash Map. Used to generate a hash code determining the entry's bucket in the Hash Map. This ensures that every entry can be efficiently located.
    - Hash Code: A number generated from an entry's key, to determine what bucket that Hash Map entry belongs to.
    - Bucket: A Hash Map consists of many such buckets, or containers, to store entries.
    - Value: Can be nearly any kind of information, like name, birthdate, and address of a person. The value can be many different kinds of information combined.
*/


public class Main {
    public static void main(String[] args) {
        SimpleHashMap hashMap = new SimpleHashMap(10);

        // Adding some entries
        hashMap.put("123-4567", "Charlotte");
        hashMap.put("123-4568", "Thomas");
        hashMap.put("123-4569", "Jens");
        hashMap.put("123-4570", "Peter");
        hashMap.put("123-4571", "Lisa");
        hashMap.put("123-4672", "Adele");
        hashMap.put("123-4573", "Michaela");
        hashMap.put("123-6574", "Bob");

        hashMap.printMap();

        // Demonstrating retrieval and update
        System.out.println("\nName associated with '123-4570': " + hashMap.get("123-4570"));
        System.out.println("Updating the name for '123-4570' to 'James'");
        hashMap.put("123-4570", "James");
        System.out.println("Name associated with '123-4570': " + hashMap.get("123-4570"));
    }
}

class SimpleHashMap {
    private final List<List<Pair>> buckets;

    public SimpleHashMap(int size) {
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    private int hashFunction(String key) {
        int numericSum = key.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        return numericSum % buckets.size();
    }

    public void put(String key, String value) {
        int index = hashFunction(key);
        List<Pair> bucket = buckets.get(index);

        for (Pair pair : bucket) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }

        bucket.add(new Pair(key, value));
    }

    public String get(String key) {
        int index = hashFunction(key);
        List<Pair> bucket = buckets.get(index);

        for (Pair pair : bucket) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }

        return null; // Key not found
    }

    public void remove(String key) {
        int index = hashFunction(key);
        List<Pair> bucket = buckets.get(index);
        bucket.removeIf(pair -> pair.key.equals(key));
    }

    public void printMap() {
        System.out.println("Hash Map Contents:");
        for (int i = 0; i < buckets.size(); i++) {
            List<Pair> bucket = buckets.get(i);
            System.out.print("Bucket " + i + ": ");
            bucket.forEach(pair -> System.out.print("[" + pair.key + ": " + pair.value + "] "));
            System.out.println();
        }
    }
}

class Pair {
    String key;
    String value;

    public Pair(String key, String value) {
        this.key = key;
        this.value = value;
    }
}