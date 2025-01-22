package Lesson2_DSA_LinkedLists.Tut4_DSA_LinkedListsOperations;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0228 hours
 */

/* Find The Lowest Value in a Linked List
    Let's find the lowest value in a singly linked list by traversing it and checking each value.

        - Finding the lowest value in a linked list is very similar to how we found the lowest value in an array, except that we need to follow the next link to get to the next node.
        - This is how finding the lowest value in a linked list works in principle:
        - To find the lowest value we need to traverse the list like in the previous code. But in addition to traversing the list, we must also update the current lowest value when we find a node with a lower value.

    In the code below, the algorithm to find the lowest value is moved into a function called findLowestValue.
*/


public class Main2 {
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

        System.out.println("The lowest value in the linked list is: " + findLowestValue(node1));
    }

    public static int findLowestValue(Node head) {
        int minValue = head.data;
        Node currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.data < minValue) {
                minValue = currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return minValue;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}