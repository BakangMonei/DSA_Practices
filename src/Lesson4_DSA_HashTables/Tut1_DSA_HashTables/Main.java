package Lesson4_DSA_HashTables.Tut1_DSA_HashTables;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0257 hours
 */


/* Hash Table
    - A Hash Table is a data structure designed to be fast to work with.
    - The reason Hash Tables are sometimes preferred instead of arrays or linked lists is because searching for, adding, and deleting data can be done really quickly, even for large amounts of data.

    Building A Hash Table from Scratch
    - To get the idea of what a Hash Table is, let's try to build one from scratch, to store unique first names inside it.

    We will build the Hash Set in 5 steps:
        - Starting with an array.
        - Storing names using a hash function.
        - Looking up an element using a hash function.
        - Handling collisions.
        - The basic Hash Set code example and simulation.
*/


import java.util.LinkedList;

public class Main {
    static LinkedList<String>[] myHashSet = new LinkedList[10];

    public static void main(String[] args) {
        for (int i = 0; i < myHashSet.length; i++) {
            myHashSet[i] = new LinkedList<>();
        }

        add("Jones");
        add("Lisa");
        add("Bob");
        add("Siri");
        add("Pete");
        add("Stuart");

        for (LinkedList<String> bucket : myHashSet) {
            System.out.println(bucket);
        }
        System.out.println("Contains Stuart: " + contains("Stuart"));
    }

    public static int hashFunction(String value) {
        int sum = 0;
        for (char c : value.toCharArray()) {
            sum += c;
        }
        return sum % 10;
    }

    public static void add(String value) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    public static boolean contains(String value) {
        int index = hashFunction(value);
        LinkedList<String> bucket = myHashSet[index];
        return bucket.contains(value);
    }
}