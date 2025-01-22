package Lesson3_DSA_StacksAndQueues.Tut2_DSA_Queues;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0253 hours
 */
/* Queue Implementation using Linked Lists
    Reasons for using linked lists to implement queues:
        - Dynamic size: The queue can grow and shrink dynamically, unlike with arrays.
        - No shifting: The front element of the queue can be removed (enqueue) without having to shift other elements in the memory.
    Reasons for not using linked lists to implement queues:
        - Extra memory: Each queue element must contain the address to the next element (the next linked list node).
        - Readability: The code might be harder to read and write for some because it is longer and more complex.
*/

public class Main3 {
    public static void main(String[] args) {
        Queue3 myQueue = new Queue3();

        myQueue.enqueue('A');
        myQueue.enqueue('B');
        myQueue.enqueue('C');
        System.out.print("Queue: ");
        myQueue.printQueue();

        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("isEmpty: " + myQueue.isEmpty());
        System.out.println("Size: " + myQueue.size());
    }
}

class Node3 {
    char data;
    Node3 next;

    public Node3(char data) {
        this.data = data;
        this.next = null;
    }
}

class Queue3 {
    Node3 front;
    Node3 rear;
    int length;

    public Queue3() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public void enqueue(char element) {
        Node3 newNode = new Node3(element);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            length++;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        length++;
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return ' ';
        }
        Node3 temp = this.front;
        this.front = temp.next;
        if (this.front == null) {
            this.rear = null;
        }
        length--;
        return temp.data;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return ' ';
        }
        return this.front.data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void printQueue() {
        Node3 temp = this.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}