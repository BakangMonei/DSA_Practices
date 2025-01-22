package Lesson2_DSA_LinkedLists.Tut4_DSA_LinkedListsOperations;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0225 hours
 */

/* Linked List Operations
    Basic things we can do with linked lists are:
        - Traversal
        - Remove a node
        - Insert a node
        - Sort
    For simplicity, singly linked lists will be used to explain these operations below.
*/

/* Traversal of a Linked List
    - Traversing a linked list means to go through the linked list by following the links from one node to the next.
    - Traversal of linked lists is typically done to search for a specific node, and read or modify the node's content, remove the node, or insert a node right before or after that node.
    - To traverse a singly linked list, we start with the first node in the list, the head node, and follow that node's next link, and the next node's next link and so on, until the next address is null,
*/


public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
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

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(11);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        traverseAndPrint(node1);
    }
}
