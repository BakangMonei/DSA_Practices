package Lesson2_DSA_LinkedLists.Tut3_DSA_LinkedListsTypes;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0219 hours
 */

// A doubly linked list has nodes with addresses to both the previous and the next node, and therefore takes up more memory. But doubly linked lists are good if you want to be able to move both up and down in the list.

public class DoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        node1.next = node2;
        node2.prev = node1;

        Node node3 = new Node(13);
        node2.next = node3;
        node3.prev = node2;

        Node node4 = new Node(2);
        node3.next = node4;
        node4.prev = node3;

        Node currentNode = node1;
        System.out.print("Forward: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

        currentNode = node4;
        System.out.print("Backward: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }
}
