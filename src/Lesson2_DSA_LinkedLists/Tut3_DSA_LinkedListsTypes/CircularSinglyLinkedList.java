package Lesson2_DSA_LinkedLists.Tut3_DSA_LinkedListsTypes;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0220 hours
 */

/*
    - A circular linked list is like a singly or doubly linked list with the first node, the "head", and the last node, the "tail", connected.
    - In singly or doubly linked lists, we can find the start and end of a list by just checking if the links are null. But for circular linked lists, more complex code is needed to explicitly check for start and end nodes in certain applications.
    - Circular linked lists are good for lists you need to cycle through continuously.
*/

public class CircularSinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;  // Circular link

        Node currentNode = node1;
        Node startNode = node1;
        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;

        while (currentNode != startNode) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("...");  // Indicating the list loops back
    }
}
