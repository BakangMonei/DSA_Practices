package Lesson3_DSA_StacksAndQueues.Tut1_DSA_Stacks;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0243 hours
 */

/* Stack Implementation using Linked Lists
    A reason for using linked lists to implement stacks:
        - Dynamic size: The stack can grow and shrink dynamically, unlike with arrays.

    Reasons for not using linked lists to implement stacks:
        - Extra memory: Each stack element must contain the address to the next element (the next linked list node).
        - Readability: The code might be harder to read and write for some because it is longer and more complex.

    This is how a stack can be implemented using a linked list.
*/

public class Main2 {
    public static void main(String[] args) {
        Stack2 myStack = new Stack2();

        myStack.push('A');
        myStack.push('B');
        myStack.push('C');

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("Size: " + myStack.size());
    }
}

class Node {
    char value;
    Node next;
    Node(char value) {
        this.value = value;
        this.next = null;
    }
}

class Stack2 {
    private Node head;
    private int size;

    public Stack2() {
        this.head = null;
        this.size = 0;
    }

    public void push(char value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public char pop() {
        if (isEmpty()) {
            return ' ';
        }
        char popped = head.value;
        head = head.next;
        size--;
        return popped;
    }

    public char peek() {
        if (isEmpty()) {
            return ' ';
        }
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}