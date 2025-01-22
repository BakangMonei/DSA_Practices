package Lesson2_DSA_LinkedLists.Tut1_DSA_LinkedLists;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0118 hours
 */

/* A Linked List is, as the word implies, a list where the nodes are linked together. Each node contains data and a pointer.
The way they are linked together is that each node points to where in the memory the next node is placed. */

/* Linked Lists
    - A linked list consists of nodes with some sort of data, and a pointer, or link, to the next node.
    - A singly linked list.
    - A big benefit with using linked lists is that nodes are stored wherever there is free space in memory, the nodes do not have to be stored contiguously right after each other like elements are stored in arrays. Another nice thing with linked lists is that when adding or removing nodes, the rest of the nodes in the list do not have to be shifted.
*/

/* Linked Lists vs Arrays
    - The easiest way to understand linked lists is perhaps by comparing linked lists with arrays.
    - Linked lists consist of nodes, and is a linear data structure we make ourselves, unlike arrays which is an existing data structure in the programming language that we can use.
    - Nodes in a linked list store links to other nodes, but array elements do not need to store links to other elements.
*/



public class Main {
    public static void main(String[] args) {
        int myVal = 13;

        // Print the value of 'myVal'
        System.out.println("Value of integer 'myVal': " + myVal);

        // Print the size of 'myVal' in bytes (Java doesn't allow getting the size directly like C)
        System.out.println("Size of integer 'myVal': " + Integer.BYTES + " bytes");

        // In Java, we cannot directly print the memory address like in C.
        // We can, however, print the hash code of the object (not the actual memory address).
        System.out.println("Address to 'myVal': " + System.identityHashCode(myVal));

        // Print the size of the reference type (Object)
        System.out.println("Size of the address to 'myVal': " + Integer.BYTES + " bytes");
    }
}

