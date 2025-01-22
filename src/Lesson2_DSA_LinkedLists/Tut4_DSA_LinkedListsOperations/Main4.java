package Lesson2_DSA_LinkedLists.Tut4_DSA_LinkedListsOperations;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0232 hours
 */

/* Insert a Node in a Linked List
    - Inserting a node into a linked list is very similar to deleting a node, because in both cases we need to take care of the next pointers to make sure we do not break the linked list.
    - To insert a node in a linked list we first need to create the node, and then at the position where we insert it, we need to adjust the pointers so that the previous node points to the new node, and the new node points to the correct next node.
    - In the "insertNodeAtPosition" function below, the return value is the new head of the linked list. So for example, if the node is inserted at the start of the linked list, the new head returned will be the new node.
*/

public class Main4 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void traverseAndPrint(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static Node insertNodeAtPosition(Node head, Node newNode, int position) {
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node currentNode = head;
        for (int i = 1; i < position - 1 && currentNode != null; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(3);
        Node node3 = new Node(2);
        Node node4 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Original list:");
        traverseAndPrint(node1);

        // Insert a new node with value 97 at position 2
        Node newNode = new Node(97);
        node1 = insertNodeAtPosition(node1, newNode, 2);

        System.out.println("\nAfter insertion:");
        traverseAndPrint(node1);
    }
}
