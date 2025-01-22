package Lesson2_DSA_LinkedLists.Tut2_DSA_LinkedListsMemory;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0214 hours
 */

public class LinkedList {
    // Define the Node class
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Print the linked list
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating and connecting nodes
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Print the linked list
        printList(node1);
    }
}

