package Lesson3_DSA_StacksAndQueues.Tut2_DSA_Queues;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0251 hours
 */

public class Main2 {
    public static void main(String[] args) {
        Queue2 myQueue = new Queue2(10);

        myQueue.enqueue('A');
        myQueue.enqueue('B');
        myQueue.enqueue('C');
        myQueue.printQueue();

        System.out.println("Dequeue: " + myQueue.dequeue());

        System.out.println("Peek: " + myQueue.peek());

        System.out.println("isEmpty: " + myQueue.isEmpty());

        System.out.println("Size: " + myQueue.size());
    }
}

class Queue2 {
    char[] queue;
    int front;
    int size;
    int capacity;

    public Queue2(int capacity) {
        this.capacity = capacity;
        this.queue = new char[capacity];
        this.front = 0;
        this.size = 0;
    }

    public void enqueue(char element) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[(front + size) % capacity] = element;
        size++;
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000'; // Null character
        }
        char item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000'; // Null character
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
