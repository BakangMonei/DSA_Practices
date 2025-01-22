package Lesson2_DSA_LinkedLists.Tut4_DSA_LinkedListsOperations;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0230 hours
 */

/* Delete a Node in a Linked List
    - In this case we have the link (or pointer or address) to a node that we want to delete.
    - It is important to connect the nodes on each side of the node before deleting it, so that the linked list is not broken.
    - So before deleting the node, we need to get the next pointer from the previous node, and connect the previous node to the new next node before deleting the node in between.
    - In a singly linked list, like we have here, to get the next pointer from the previous node we actually need traverse the list from the start, because there is no way to go backwards from the node we want to delete.

    - Also, it is a good idea to first connect next pointer to the node after the node we want to delete, before we delete it. This is to avoid a 'dangling' pointer, a pointer that points to nothing, even if it is just for a brief moment.

    In the code below, the algorithm to delete a node is moved into a function called "deleteSpecificNode".
*/

public class Main3 {
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

    public static Node deleteSpecificNode(Node head, Node nodeToDelete) {
        if (head == nodeToDelete) {
            return head.next;
        }

        Node currentNode = head;
        while (currentNode.next != null && currentNode.next != nodeToDelete) {
            currentNode = currentNode.next;
        }

        if (currentNode.next == null) {
            return head;
        }

        currentNode.next = currentNode.next.next;

        return head;
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

        System.out.println("Before deletion:");
        traverseAndPrint(node1);

        node1 = deleteSpecificNode(node1, node4);

        System.out.println("\nAfter deletion:");
        traverseAndPrint(node1);
    }
}
